import { Component, OnInit } from '@angular/core';
import { Skill } from '../model/skill';
import { SkillService } from '../service/skill.service';

@Component({
  selector: 'app-all-skills',
  templateUrl: './all-skills.component.html',
  styleUrls: ['./all-skills.component.sass']
})
export class AllSkillsComponent implements OnInit {

  skills: Skill[];

  constructor(
    private service: SkillService
  ) {
  }

  ngOnInit(): void {
    this.service.allSkills().subscribe(res => {
      this.skills = res;
    });
  }

}
