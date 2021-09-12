package sbnz.integracija.example.model;

import java.util.Map;

import javax.persistence.*;

@Entity
public class SkillNode{	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	private Skill skill;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Boolean essential;
	
	@Column(nullable = false)
	private Boolean specific;
	
	@Column(nullable = false)
	private Integer perksAvailable;
	
	@Column(nullable = false)
	private Integer skillLevelNeeded;
	
	@Column(nullable = false)
	private Integer position;
	
	@Column(nullable = false)
	private Integer activated;
	
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getEssential() {
		return essential;
	}
	public void setEssential(Boolean essential) {
		this.essential = essential;
	}
	public Boolean getSpecific() {
		return specific;
	}
	public void setSpecific(Boolean specific) {
		this.specific = specific;
	}
	public Integer getPerksAvailable() {
		return perksAvailable;
	}
	public void setPerksAvailable(Integer perksAvailable) {
		this.perksAvailable = perksAvailable;
	}
	public Integer getSkillLevelNeeded() {
		return skillLevelNeeded;
	}
	public void setSkillLevelNeeded(Integer skillLevelNeeded) {
		this.skillLevelNeeded = skillLevelNeeded;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer getActivated() {
		return activated;
	}
	public void setActivated(Integer activated) {
		this.activated = activated;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SkillNode(Skill skill, String description, Boolean essential, Boolean specific, Integer perksAvailable,
			Integer skillLevelNeeded, SkillNode parent, String name) {
		super();
		this.skill = skill;
		this.name = name;
		this.description = description;
		this.essential = essential;
		this.specific = specific;
		this.perksAvailable = perksAvailable;
		this.skillLevelNeeded = skillLevelNeeded;
		this.activated = 0;
	}
	
	public SkillNode() {
		this.activated = 0;
	}
	
	@Override
	public String toString() {
		return "SkillNode [id=" + id + ", name=" + name + ", description=" + description + ", essential=" + essential
				+ ", specific=" + specific + ", perksAvailable=" + perksAvailable + ", skillLevelNeeded="
				+ skillLevelNeeded + ", position=" + position + ", activated=" + activated + "]";
	}
	
	public Integer getQueryPosition() {
		int chainPriority = this.getPosition();
		Map<String, Integer> subsets = this.skill.getSubsets();
		for (String s: subsets.keySet()) {
			if (this.name.contains(s))
				chainPriority += subsets.get(s);
		}
		if (this.getSpecific() && this.getEssential()) {
			chainPriority += 20;
			chainPriority += this.getActivated();
		}
		else if (this.getPerksAvailable() + this.getActivated() > 1) {
			chainPriority += 10;
			chainPriority += this.getPerksAvailable() + this.getActivated();
		}
		return chainPriority;
	}

}
