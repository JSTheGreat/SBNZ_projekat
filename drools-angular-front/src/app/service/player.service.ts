import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from '../model/player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  private readonly port = 'http://localhost:8080/player';

  private headers = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) { }

  setStart(race:string, role:string): Observable<any> {
    return this.http.put<void>(this.port + "/" + race + "/" + role, { headers: this.headers, responseType: 'json' });
  }

  getPlayer(): Observable<Player> {
    return this.http.get<Player>(this.port, { headers: this.headers, responseType: 'json' });
  }

}
