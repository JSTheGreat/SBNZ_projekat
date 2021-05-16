package model;

import java.util.ArrayList;
import java.util.List;

public class SkillNode{	
	
	private String skill;
	private String description;
	private Boolean essential;
	private Boolean specific;
	private Integer perksAvailable;
	private Integer skillLevelNeeded;
	private SkillNode parent;
	private List<SkillNode> children;
	private Boolean activated;
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
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
	
	public SkillNode(String skill, String description, Boolean essential, Boolean specific, Integer perksAvailable,
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
