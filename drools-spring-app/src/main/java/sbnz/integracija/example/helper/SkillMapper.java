package sbnz.integracija.example.helper;

import java.util.ArrayList;
import java.util.List;

import sbnz.integracija.example.dto.SkillDTO;
import sbnz.integracija.example.model.Skill;

public class SkillMapper {
	
	public SkillDTO toDTO(Skill entity) {
		System.out.println("Entity id: " + entity.getId());
		return new SkillDTO(
				entity.getId(),
				entity.getPlayer().getId(),
				entity.getSubsets(),
				entity.getName(),
				entity.getLevel(),
				entity.getType().name(),
				entity.getPriority(),
				entity.getOrientation().name()
				);
	}
	
	public List<SkillDTO> toDtoList(List<Skill> entityList){
		System.out.println("to dto list method entered!");
		List<SkillDTO> dtoList = new ArrayList<SkillDTO>();
		for(Skill skill: entityList) {
			System.out.println("trying to enter to dto method");
			dtoList.add(toDTO(skill));
		}
		return dtoList;
	}

}
