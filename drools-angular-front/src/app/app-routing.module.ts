import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AllSkillsComponent } from './all-skills/all-skills.component';
import { StartComponent } from './start/start.component';


const routes: Routes = [{
  path: '',
  component: StartComponent
},
{
  path: 'all-skills',
  component: AllSkillsComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
