import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Skill } from '../model/skill';

@Injectable({
  providedIn: 'root'
})
export class SkillService {

  private readonly port = 'http://localhost:8080/skill';

  private headers = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) { }

  allSkills(): Observable<Skill[]> {
    return this.http.get<Skill[]>(this.port, { headers: this.headers, responseType: 'json' });
  }
}
