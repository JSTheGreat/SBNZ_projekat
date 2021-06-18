package sbnz.integracija.example.dto;

public class SkillNodeDTO {
	
    private Integer id;
	
	private Integer skillId;
	
	private String name;
	
	private String description;
	
	private Boolean essential;
	
	private Boolean specific;
	
	private Integer perksAvailable;
	
	private Integer skillLevelNeeded;
	
	private Boolean activated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
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

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public SkillNodeDTO(Integer id, Integer skillId, String name, String description, Boolean essential, 
			Boolean specific, Integer perksAvailable, Integer skillLevelNeeded, Boolean activated) {
		super();
		this.id = id;
		this.skillId = skillId;
		this.name = name;
		this.description = description;
		this.essential = essential;
		this.specific = specific;
		this.perksAvailable = perksAvailable;
		this.skillLevelNeeded = skillLevelNeeded;
		this.activated = activated;
	}

	public SkillNodeDTO() {
	}

}
