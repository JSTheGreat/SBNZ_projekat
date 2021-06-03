package sbnz.integracija.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.model.SkillNode;
import sbnz.integracija.example.repository.SkillNodeRepository;

@Service
public class SkillNodeService {
	
	@Autowired
	private SkillNodeRepository repository;
	
	public SkillNode save(SkillNode skill) {
		return repository.save(skill);
	}
	
	public List<SkillNode> findAll(){
		return repository.findAll();
	}
	
	public SkillNode findOne(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}

}
