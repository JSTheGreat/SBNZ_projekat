package sbnz.integracija.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;

import org.springframework.transaction.annotation.Transactional;

import sbnz.integracija.example.enums.Orientation;
import sbnz.integracija.example.enums.SkillType;

@Entity
public class Skill {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	private Player player;
	
	@ElementCollection
    @CollectionTable(name="subsets")
	@MapKeyColumn(name = "subset_name")
    @Column(name = "value")
	private Map<String, Integer> subsets;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer level;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "skill")
	private Set<SkillNode> nodes;
	
	@Column(nullable = false)
	private SkillType type;
	
	@Column(nullable = false)
	private Integer priority;
	
	@Column(nullable = false)
	private Orientation orientation;
	
	public Map<String, Integer> getSubsets() {
		return subsets;
	}
	public void setSubsets(HashMap<String, Integer> subsets) {
		this.subsets = subsets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Set<SkillNode> getRoot() {
		return nodes;
	}
	public void setRoot(Set<SkillNode> nodes) {
		this.nodes = nodes;
	}
	public SkillType getType() {
		return type;
	}
	public void setType(SkillType type) {
		this.type = type;
	}
	public void setType(String type) {
		this.type = SkillType.valueOf(type);
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		if (priority != null)
			this.priority = priority;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = Orientation.valueOf(orientation);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Set<SkillNode> getNodes() {
		return nodes;
	}
	public void setNodes(Set<SkillNode> nodes) {
		this.nodes = nodes;
	}
	public void setSubsets(Map<String, Integer> subsets) {
		this.subsets = subsets;
	}
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public Skill(String name, Set<SkillNode> nodes, SkillType type, Integer priority, Orientation orientation) {
		super();
		this.name = name;
		this.nodes = nodes;
		this.type = type;
		this.priority = priority;
		this.orientation = orientation;
		this.level = 15;
		this.subsets = new HashMap<String, Integer>();
	}
	
	public Skill() {
		this.level = 15;
		this.subsets = new HashMap<String, Integer>();
	}
	
	@Override
	public String toString() {
		return "Skill [id=" + id + ", subsets=" + subsets + ", name=" + name + ", level=" + level + ", type=" + type
				+ ", priority=" + priority + ", orientation=" + orientation + "]";
	}
	
	public void incSubset(String subset) {
		this.subsets.put(subset, this.subsets.get(subset)+1);		
	}
	
	public Boolean hasAvailable() {
		for (SkillNode node: this.getNodes()) {
			if (node.getPerksAvailable() > 0 && node.getSkillLevelNeeded() <= this.getLevel())
				return true;
		}
		return false;
	}
	
	public Boolean hasEssential() {
		for (SkillNode node: this.getNodes()) {
			if (node.getPerksAvailable() > 0 && node.getSkillLevelNeeded() <= this.getLevel()
					&& node.getEssential())
				return true;
		}
		return false;
	}
	
	public Boolean isPlayersClass() {
		if (this.getOrientation() == this.getPlayer().getRole())
			return true;
		return false;
	}
	
	@Transactional
	public Double getQueryPosition() {
		double chainPriority = 0.0;
		if (!this.hasAvailable())
			return chainPriority;
		chainPriority += this.getPriority();
		if (this.getTotalPerks() != null) {
			if (this.getTotalPerks() % 3 == 0 && this.getTotalPerks() != 0)
				chainPriority += 1.0;
		}
		if (this.getType() == SkillType.DEFENSE)
			chainPriority += 0.25;
		else if (this.getType() == SkillType.ASSIST) 
			chainPriority += 0.5;
		if (!this.isPlayersClass() && !this.hasEssential())
			chainPriority += 3.0;
		return chainPriority;
	}
	
	@Transactional
	public Integer getTotalPerks() {
		int perks = 0;
		for (SkillNode node: this.nodes) {
			if (node.getActivated()>0)
				perks += node.getActivated();
		}
		return perks;
	}
	
	public List<SkillNode> getAvailables() {
		List<SkillNode> ret = new ArrayList<>();
		int perks = this.getTotalPerks();
		for (SkillNode node: this.nodes) {
			if (node.getPosition() <= (perks+1) && node.getPerksAvailable() > 0)
				ret.add(node);
		}
		return ret;
	}
			
}
