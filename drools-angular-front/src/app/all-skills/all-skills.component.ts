import { Component, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Player } from '../model/player';
import { Skill } from '../model/skill';
import { SkillNode } from '../model/skill-node';
import { PlayerService } from '../service/player.service';
import { SkillNodeService } from '../service/skill-node.service';
import { SkillService } from '../service/skill.service';

@Component({
  selector: 'app-all-skills',
  templateUrl: './all-skills.component.html',
  styleUrls: ['./all-skills.component.sass']
})
export class AllSkillsComponent implements OnInit {

  @ViewChild('content', { static: false }) private content;

  skills: Skill[];
  player: Player;
  nodes: SkillNode[];
  selected: string;



  constructor(
    private service: SkillService,
    private nodeService: SkillNodeService,
    private playerService: PlayerService,
    private modal: NgbModal,
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.service.allSkills().subscribe(res => {
      this.skills = res;
    });
    this.playerService.getPlayer().subscribe(res => {
      this.player = res;
    });
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
      this.ngOnInit();
    });
  }

  incSubset(id, subset){
    this.service.incSkillWSubset(id, subset).subscribe(res => {
      this.ngOnInit();
    });
  }

  openNodes(skillId, skillName){
    this.selected = skillName;
    this.nodeService.getNodes(skillId).subscribe(res => {
      this.nodes = res;
      this.modal.open(this.content, { scrollable: true, size: 'xl'});
    });
  }

}
