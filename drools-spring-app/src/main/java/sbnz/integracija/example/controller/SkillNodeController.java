package sbnz.integracija.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.SkillNodeDTO;
import sbnz.integracija.example.model.SkillNode;
import sbnz.integracija.example.service.KieService;
import sbnz.integracija.example.service.SkillNodeService;

@RestController
@CrossOrigin
@RequestMapping("/node")
public class SkillNodeController {
	
	@Autowired
	private SkillNodeService service;
	
	@Autowired
	private KieService kieService;
		
	@RequestMapping(value="/{skillId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SkillNodeDTO>> getAllBySkill(@PathVariable Integer skillId){
		List<SkillNode> nodes = service.findBySkill(skillId);
		List<SkillNodeDTO> ret = new ArrayList<>();
		for (SkillNode node: nodes) {
			node = service.save(node);
			ret.add(new SkillNodeDTO(node));
		}
		return new ResponseEntity<>(ret, HttpStatus.OK);
	}

}
