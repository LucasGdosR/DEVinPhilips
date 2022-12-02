import { Component } from '@angular/core';
import { SaveLocallyService } from 'src/app/services/save-locally.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent {
  constructor(private service: SaveLocallyService){};

  email: string = "";
  password: string = "";

  salvar(){
    this.service.saveLocally(this.email, this.password);
  }
}
