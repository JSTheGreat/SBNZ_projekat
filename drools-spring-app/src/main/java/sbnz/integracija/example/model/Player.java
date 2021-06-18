package sbnz.integracija.example.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import sbnz.integracija.example.enums.Orientation;

@Entity
public class Player {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(nullable = false)
	private String race;
	
	@Column(nullable = false)
	private Orientation role;
	
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
	public Orientation getRole() {
		return role;
	}
	public void setRole(Orientation role) {
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Player(String race, Orientation role) {
		super();
		this.race = race;
		this.role = role;
		this.skills = new HashSet<Skill>();
		this.level = 1.0;
	}
	
	public Player() {
	}
	
	public void setRole(String role2) {
		if (role2.equals("WARRIOR"))
			this.role = Orientation.WARRIOR;
		else if (role2.equals("MAGE"))
			this.role = Orientation.MAGE;
		else
			this.role = Orientation.THIEF;
		
	}
	
	public void setHeadStart(String skillName, Integer level) {
		for (Skill skill: this.skills) {
			if (skill.getName().equals(skillName)) {
				skill.setLevel(level);
				break;
			}
		}
	}
	
	public Integer skillLevel(String skillName) {
		for (Skill skill: this.skills) {
			if (skill.getName().equals(skillName)) {
				return skill.getLevel();
			}
		}
		return null;
	}

}
