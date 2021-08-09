package sbnz.integracija.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.SkillDTO;
import sbnz.integracija.example.model.Skill;
import sbnz.integracija.example.service.KieService;
import sbnz.integracija.example.service.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {
		
	@Autowired
	private SkillService service;
	
	@Autowired
	private KieService kieService;
		
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SkillDTO>> getAllSkills(){
		System.out.println("");
		List<Skill> skills = service.findAll();
		List<SkillDTO> ret = new ArrayList<>();
		for (Skill skill: skills) {
			System.out.println(skill);
			ret.add(new SkillDTO(skill));
		}
		return new ResponseEntity<>(ret, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}/{subset}", method = RequestMethod.PUT)
	public ResponseEntity<Void> increaseSkill(@PathVariable Integer id, @PathVariable String subset){
		Skill increased = service.findOne(id);
		if (increased.getSubsets().size() != 0)
			increased.incSubset(subset);
		increased = kieService.incSkill(increased);
		increased = service.save(increased);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
