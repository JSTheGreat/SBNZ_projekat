import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PlayerService } from '../service/player.service';

@Component({
  selector: 'app-start',
  templateUrl: './start.component.html',
  styleUrls: ['./start.component.sass']
})
export class StartComponent implements OnInit {

  startStats: FormGroup;

  constructor(
    private fb:FormBuilder,
    private service: PlayerService,
    private router: Router
    ) { 
    this.startStats = this.fb.group({
      race: ['Nord',Validators.required],
      role: ['WARRIOR',Validators.required]
    });
  }

  ngOnInit(): void {
  }

  submit(){
    const val = this.startStats.value;
    this.service.setStart(val.race, val.role).subscribe(res => {
      this.router.navigateByUrl('/all-skills');
    });
  }

}
