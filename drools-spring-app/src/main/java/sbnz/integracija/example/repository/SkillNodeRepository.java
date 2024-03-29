package sbnz.integracija.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbnz.integracija.example.model.SkillNode;

@Repository
public interface SkillNodeRepository extends JpaRepository<SkillNode, Integer>{
	
	List<SkillNode> findBySkillId(Integer id);

}
