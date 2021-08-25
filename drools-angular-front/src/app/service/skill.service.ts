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

  incSkill(id: number): Observable<any>{
    return this.http.put<void>(this.port + "/" + id, { headers: this.headers, responseType: 'json' });
  }

  incSkillWSubset(id: number, subset: string): Observable<any>{
    return this.http.put<void>(this.port + "/" + id + "/" + subset, { headers: this.headers, responseType: 'json' });
  }
}
