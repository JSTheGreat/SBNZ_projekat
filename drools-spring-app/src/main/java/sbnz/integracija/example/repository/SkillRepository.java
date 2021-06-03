package sbnz.integracija.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer>{

}
