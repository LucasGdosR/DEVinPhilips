import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculadoraService {

  constructor() { }

  somar(a: number, b: number){
    return a + b;
  }
  subtrair(a: number, b: number){
    return a - b;
  }
  multiplicar(a: number, b: number){
    return a * b;
  }
  dividir(a: number, b: number){
    return a / b;
  }
}
