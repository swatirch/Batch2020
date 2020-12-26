import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


const api="http://localhost/admin/php/";

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private httpclient:HttpClient) { }

  saveData(data)
  {
    return this.httpclient.post(api + 'register.php',data);
  }
}
