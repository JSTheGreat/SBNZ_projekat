package sbnz.integracija.example.dto;

public class PlayerDTO {
	
	private Integer id;
	
	private String race;
	
	private String role;
	
	private Double level;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public PlayerDTO(Integer id, String race, String role, Double level) {
		super();
		this.id = id;
		this.race = race;
		this.role = role;
		this.level = level;
	}

	public PlayerDTO() {
	}
	
}
