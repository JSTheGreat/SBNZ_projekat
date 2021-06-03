package sbnz.integracija.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.model.Skill;
import sbnz.integracija.example.repository.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository repository;
	
	public Skill save(Skill skill) {
		return repository.save(skill);
	}
	
	public List<Skill> findAll(){
		return repository.findAll();
	}
	
	public Skill findOne(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}

}
