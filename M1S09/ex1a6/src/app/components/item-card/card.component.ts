import { Component } from '@angular/core';

@Component({
  selector: 'app-item-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})

export class ItemCardComponent {
  onePunchMan: any = {
    name: 'Saitama, "Careca de Capa"',
    urlImg: 'https://criticalhits.com.br/wp-content/uploads/2020/06/saitama-1.jpg',
    description: 'O "Careca de Capa" é um herói em ascensão, tendo subido rapidamente da classe C, para B, e atualmente A. As pessoas ficam surpresas com seu relacionamento com Genos, o Ciborgue Demoníaco, que o trata com reverência, chamando-o de sensei. Sua proximidade com King, o homem mais forte do mundo, também assusta os outros.',
  }
}
