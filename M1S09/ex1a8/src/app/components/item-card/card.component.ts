import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-item-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})

export class ItemCardComponent {
  @Input() name: string = "";
  @Input() urlImg: string = "";
  @Input() description: string = "";
}
