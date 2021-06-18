package sbnz.integracija.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.model.Player;
import sbnz.integracija.example.service.KieService;
import sbnz.integracija.example.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	
	private KieService kieService;

	@Autowired
	private PlayerService service;
			
	@Autowired
	public PlayerController(KieService kieService) {
		this.kieService = kieService;
	}
	
	@RequestMapping(value="/{race}/{role}", method = RequestMethod.PUT)
	public ResponseEntity<Void> getPlayer(@PathVariable String race, @PathVariable String role){
		System.out.println("Stigne do player back-a");
		Player player = service.findOne(1);
		if (player != null)
			System.out.println("Player != null");
		player.setRace(race);
		player.setRole(role);
		System.out.println("Player attributes set");
		player = kieService.setPlayer(player);
		System.out.println("one-handed nord: " + player.skillLevel("One-handed"));
		System.out.println("haevy armor nord: " + player.skillLevel("Heavy Armor"));
		player = service.save(player);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
