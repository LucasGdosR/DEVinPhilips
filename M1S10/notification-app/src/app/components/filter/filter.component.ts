import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'ntap-filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.scss']
})
export class FilterComponent {
  @Output() filter: EventEmitter<string> = new EventEmitter();
}
