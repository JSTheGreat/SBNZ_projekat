import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SkillNode } from '../model/skill-node';

@Injectable({
  providedIn: 'root'
})
export class SkillNodeService {

  private readonly port = 'http://localhost:8080/node';

  private headers = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) { }

  getNodes(skillId: number): Observable<SkillNode[]> {
    return this.http.get<SkillNode[]>(this.port + "/" + skillId, { headers: this.headers, responseType: 'json' });
  }
}
