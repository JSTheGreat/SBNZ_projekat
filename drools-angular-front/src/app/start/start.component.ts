import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
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
    private service: PlayerService
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
      alert("Player stats have been selected!");
    });
  }

}
