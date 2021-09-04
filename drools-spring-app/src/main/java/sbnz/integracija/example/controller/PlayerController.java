package sbnz.integracija.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.PlayerDTO;
import sbnz.integracija.example.model.Player;
import sbnz.integracija.example.service.KieService;
import sbnz.integracija.example.service.PlayerService;

@RestController
@CrossOrigin
@RequestMapping("/player")
public class PlayerController {
	
	private KieService kieService;

	@Autowired
	private PlayerService service;
			
	@Autowired
	public PlayerController(KieService kieService) {
		this.kieService = kieService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<PlayerDTO> getPlayer(){
		Player player = service.findOne(1);
		PlayerDTO ret = new PlayerDTO(player);
		return new ResponseEntity<>(ret, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{race}/{role}", method = RequestMethod.PUT)
	public ResponseEntity<Void> startPlayer(@PathVariable String race, @PathVariable String role){
		Player player = service.findOne(1);
		player.setRace(race);
		player.setRole(role);
		player = kieService.setPlayer(player);
		player = service.save(player);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> changePlayer(){
		System.gc();
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
