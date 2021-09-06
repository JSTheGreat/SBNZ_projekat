package sbnz.integracija.example.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import sbnz.integracija.example.enums.Orientation;
import sbnz.integracija.example.enums.SkillType;

@Entity
public class Player {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
	private String race;
	
	@Column
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
	
	public void setPriority(String skillName, Integer priority) {
		for (Skill skill: this.skills) {
			if (skill.getName().equals(skillName)) {
				skill.setPriority(priority);
				break;
			}
		}
	}
	
	private int getSkillPriority(String skill) {
		for (Skill s: this.skills) {
			if (s.getName().equals(skill))
				return s.getPriority();
		}
		return 0;
	}
	
	public void lowerPriorities(List<String> skills, Integer priority) {
		for (String s: skills) {
			if (priority != null)
				this.setPriority(s, this.getSkillPriority(s)+1);
		}
	}
	
	public void setPriorities(SkillType type, Integer priority) {
		for (Skill skill: this.skills) {
			if (skill.getType() == type && skill.getPriority()>priority)
				this.setPriority(skill.getName(), priority);
		}
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", race=" + race + ", role=" + role + ", level=" + level + "]";
	}

}
