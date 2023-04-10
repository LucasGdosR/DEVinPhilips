import { Component } from '@angular/core';
import { CalculadoraService } from './calculadora.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(public calculadora: CalculadoraService){}
  
  resultado: number = 0;
  a: number = 0;
  b: number = 0;
}
