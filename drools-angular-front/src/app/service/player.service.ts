import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

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

}
