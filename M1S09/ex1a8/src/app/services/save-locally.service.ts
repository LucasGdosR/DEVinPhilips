import { Injectable } from '@angular/core';
import { EmailValidator } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class SaveLocallyService {

  constructor() { }

  saveLocally(email: string, password: string){
    localStorage.setItem(email, JSON.stringify(password));
    console.log("Salvou");
    console.log(email);
    console.log(password);
  }
}
