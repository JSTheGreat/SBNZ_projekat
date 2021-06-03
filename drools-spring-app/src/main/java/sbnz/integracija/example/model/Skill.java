package sbnz.integracija.example.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

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
	
	@OneToOne
	private SkillNode root;
	
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
	public SkillNode getRoot() {
		return root;
	}
	public void setRoot(SkillNode root) {
		this.root = root;
	}
	public SkillType getType() {
		return type;
	}
	public void setType(SkillType type) {
		this.type = type;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Skill(String name, SkillNode root, SkillType type, Integer priority, Orientation orientation) {
		super();
		this.name = name;
		this.root = root;
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
			
}
