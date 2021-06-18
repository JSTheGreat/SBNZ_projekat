package sbnz.integracija.example.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.model.Player;

@Service
public class KieService {

	private static Logger log = LoggerFactory.getLogger(KieService.class);

	private final KieContainer kieContainer;

	@Autowired
	public KieService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}
	
	public Player setPlayer(Player player) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(player);
		kieSession.fireAllRules();
		kieSession.dispose();
		return player;
	}
	
}
