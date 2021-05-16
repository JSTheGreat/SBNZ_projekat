package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String race;
	private String role;
	private Double level;
	private List<Skill> skills;
	
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getLevel() {
		return level;
	}
	public void setLevel(Double level) {
		this.level = level;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	public Player(String race, String role) {
		super();
		this.race = race;
		this.role = role;
		this.skills = new ArrayList<Skill>();
		this.level = 1.0;
	}
	
	public Player() {
	}

}
