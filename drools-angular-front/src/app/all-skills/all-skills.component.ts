import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../model/player';
import { Skill } from '../model/skill';
import { PlayerService } from '../service/player.service';
import { SkillService } from '../service/skill.service';

@Component({
  selector: 'app-all-skills',
  templateUrl: './all-skills.component.html',
  styleUrls: ['./all-skills.component.sass']
})
export class AllSkillsComponent implements OnInit {

  skills: Skill[];
  player: Player;

  constructor(
    private service: SkillService,
    private router: Router,
    private playerService: PlayerService
  ) {
  }

  ngOnInit(): void {
    this.service.allSkills().subscribe(res => {
      this.skills = res;
    });
    this.playerService.getPlayer().subscribe(res => {
      this.player = res;
    })
  }

  incSkill(id){
    this.service.incSkill(id).subscribe(res => {
      console.log("Skill should be increased in front");
      this.ngOnInit();
      console.log("all skills should be updated");
    });
  }

}
