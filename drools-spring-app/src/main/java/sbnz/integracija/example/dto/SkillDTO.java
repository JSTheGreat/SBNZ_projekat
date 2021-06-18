package sbnz.integracija.example.dto;

import java.util.Map;

public class SkillDTO {
	
    private Integer id;
	
	private Integer playerId;
	
	private Map<String, Integer> subsets;
	
	private String name;
	
	private Integer level;
		
	private String type;
	
	private Integer priority;
	
	private String orientation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public Map<String, Integer> getSubsets() {
		return subsets;
	}

	public void setSubsets(Map<String, Integer> subsets) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public SkillDTO(Integer id, Integer playerId, Map<String, Integer> subsets, String name, Integer level,
			String type, Integer priority, String orientation) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.subsets = subsets;
		this.name = name;
		this.level = level;
		this.type = type;
		this.priority = priority;
		this.orientation = orientation;
	}

	public SkillDTO() {
	}

}
