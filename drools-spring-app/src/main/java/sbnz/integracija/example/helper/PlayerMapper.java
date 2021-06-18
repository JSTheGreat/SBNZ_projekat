package sbnz.integracija.example.helper;

import java.util.ArrayList;
import java.util.List;

import sbnz.integracija.example.dto.PlayerDTO;
import sbnz.integracija.example.model.Player;

public class PlayerMapper {
	
	public PlayerDTO toDTO(Player entity) {
		return new PlayerDTO(
				entity.getId(),
				entity.getRace(),
				entity.getRole().name(),
				entity.getLevel()
				);
	}
	
	public List<PlayerDTO> toDtoList(List<Player> entityList){
		List<PlayerDTO> dtoList = new ArrayList<PlayerDTO>();
		for(Player player: entityList) {
			dtoList.add(toDTO(player));
		}
		return dtoList;
	}

}
