package sbnz.integracija.example.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Player {
	
	@Column(nullable = false)
	private String race;
	
	@Column(nullable = false)
	private String role;
	
	@Column(nullable = false)
	private Double level;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "player")
	private Set<Skill> skills;
	
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
	public Set<Skill> getSkills() {
		return skills;
	}
	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}
	
	public Player(String race, String role) {
		super();
		this.race = race;
		this.role = role;
		this.skills = new HashSet<Skill>();
		this.level = 1.0;
	}
	
	public Player() {
	}

}
