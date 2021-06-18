package sbnz.integracija.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.model.Skill;
import sbnz.integracija.example.service.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {
		
	@Autowired
	private SkillService service;
		
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> getAllSkills(){
		System.out.println("Stigne do skill back-a");
		List<Skill> skills = service.findAll();
		System.out.println("Skill number: " + skills.size());
		for (Skill skill: skills) {
			System.out.println("Skill: "+skill.getName()+", level: "+skill.getLevel());
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
