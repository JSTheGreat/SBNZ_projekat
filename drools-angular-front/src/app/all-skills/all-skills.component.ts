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

  hasSubset(index: number): boolean {
    if (Object.keys(this.skills[index].subsets).length == 0)
      return false;
    return true;
  }

  getSubsets(index: number){
    let ret = [];
    Object.keys(this.skills[index].subsets).forEach(el => {
      ret.push(el);
    });
    return ret;
  }

  getSubsetLevel(index:number, name: string){
    return this.skills[index].subsets[name];
  }

  incSkill(id){
    this.service.incSkill(id).subscribe(res => {
      console.log("Skill should be increased in front");
      this.ngOnInit();
      console.log("all skills should be updated");
    });
  }

  incSubset(id, subset){
    this.service.incSkillWSubset(id, subset).subscribe(res => {
      this.ngOnInit();
    })
  }

}
