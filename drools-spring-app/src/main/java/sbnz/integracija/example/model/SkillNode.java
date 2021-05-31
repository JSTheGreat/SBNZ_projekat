package sbnz.integracija.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class SkillNode{	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@OneToOne
	private Skill skill;
	
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
	
	@ManyToOne
	private SkillNode parent;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent")
	private List<SkillNode> children;
	
	@Column(nullable = false)
	private Boolean activated;
	
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
	public SkillNode getParent() {
		return parent;
	}
	public void setParent(SkillNode parent) {
		this.parent = parent;
	}
	public List<SkillNode> getChildren() {
		return children;
	}
	public void setChildren(List<SkillNode> children) {
		this.children = children;
	}
	public Boolean getActivated() {
		return activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SkillNode(Skill skill, String description, Boolean essential, Boolean specific, Integer perksAvailable,
			Integer skillLevelNeeded, SkillNode parent) {
		super();
		this.skill = skill;
		this.description = description;
		this.essential = essential;
		this.specific = specific;
		this.perksAvailable = perksAvailable;
		this.skillLevelNeeded = skillLevelNeeded;
		this.parent = parent;
		this.activated = Boolean.FALSE;
		this.children = new ArrayList<SkillNode>();
	}
	
	public SkillNode() {
		this.activated = Boolean.FALSE;
		this.children = new ArrayList<SkillNode>();
	}
	
}
