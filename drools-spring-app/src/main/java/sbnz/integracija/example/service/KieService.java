package sbnz.integracija.example.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.model.Player;
import sbnz.integracija.example.model.Skill;

@Service
public class KieService {

	private static Logger log = LoggerFactory.getLogger(KieService.class);
	
	private final KieSession kieSession;

	@Autowired
	public KieService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieSession = kieContainer.newKieSession();
	}
	
	public Player setPlayer(Player player){
		kieSession.insert(player);
		kieSession.fireAllRules();
		return player;
	}
	
	public Skill incSkill(Skill skill) {
		kieSession.insert(skill);
		kieSession.fireAllRules();
		return skill;
	}
	
	public Player getPlayer() {
		Player player = (Player) kieSession.getGlobal("player");
		return player;
	}
	
	@Override
	protected void finalize() throws Throwable {
		kieSession.dispose();
	}
	
}
