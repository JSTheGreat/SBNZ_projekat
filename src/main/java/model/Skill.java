package model;

import java.util.HashMap;
import java.util.Map;

public class Skill {
	
	private Map<String, Integer> subsets;
	private String name;
	private Integer level;
	private SkillNode root;
	private String type;
	private Integer priority;
	private String orientation;
	
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
	
	public Skill(String name, SkillNode root, String type, Integer priority, String orientation) {
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
