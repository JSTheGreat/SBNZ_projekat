package sbnz.integracija.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbnz.integracija.example.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
	
	Skill findOneByName(String name);
	
}
