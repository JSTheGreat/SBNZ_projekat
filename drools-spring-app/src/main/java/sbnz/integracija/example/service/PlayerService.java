package sbnz.integracija.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.model.Player;
import sbnz.integracija.example.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repository;
	
	public Player save(Player player) {
		return repository.save(player);
	}
	
	public Player findOne(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
