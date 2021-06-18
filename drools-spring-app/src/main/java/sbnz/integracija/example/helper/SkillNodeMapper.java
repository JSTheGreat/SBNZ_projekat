package sbnz.integracija.example.helper;

import java.util.ArrayList;
import java.util.List;

import sbnz.integracija.example.dto.SkillNodeDTO;
import sbnz.integracija.example.model.SkillNode;

public class SkillNodeMapper {
	
	public SkillNodeDTO toDTO(SkillNode entity) {
		return new SkillNodeDTO(
				entity.getId(),
				entity.getSkill().getId(),
				entity.getName(),
				entity.getDescription(),
				entity.getEssential(),
				entity.getSpecific(),
				entity.getPerksAvailable(),
				entity.getSkillLevelNeeded(),
				entity.getActivated()
				);
	}
	
	public List<SkillNodeDTO> toDtoList(List<SkillNode> entityList){
		List<SkillNodeDTO> dtoList = new ArrayList<SkillNodeDTO>();
		for(SkillNode node: entityList) {
			dtoList.add(toDTO(node));
		}
		return dtoList;
	}

}
