package sbnz.integracija.example.dto;

import sbnz.integracija.example.model.SkillNode;

public class SkillNodeDTO {
	
    private Integer id;
	
	private String skillName;
	
	private String name;
	
	private String description;
	
	private Boolean essential;
	
	private Boolean specific;
	
	private Integer perksAvailable;
	
	private Integer skillLevelNeeded;
	
	private Integer activated;
	
	private Integer position;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getSkillId() {
		return skillName;
	}

	public void setSkillId(String skillName) {
		this.skillName = skillName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getActivated() {
		return activated;
	}

	public void setActivated(Integer activated) {
		this.activated = activated;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public SkillNodeDTO(Integer id, String skillName, String name, String description, Boolean essential, 
			Boolean specific, Integer perksAvailable, Integer skillLevelNeeded, Integer activated, Integer position) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.name = name;
		this.description = description;
		this.essential = essential;
		this.specific = specific;
		this.perksAvailable = perksAvailable;
		this.skillLevelNeeded = skillLevelNeeded;
		this.activated = activated;
		this.position = position;
	}

	public SkillNodeDTO() {
	}

	public SkillNodeDTO(SkillNode node) {
		this.id = node.getId();
		this.activated = node.getActivated();
		this.description = node.getDescription();
		this.essential = node.getEssential();
		this.name = node.getName();
		this.perksAvailable = node.getPerksAvailable();
		this.skillName = node.getSkill().getName();
		this.skillLevelNeeded = node.getSkillLevelNeeded();
		this.specific = node.getSpecific();
		this.position = node.getPosition();
	}

}
