import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {
  @Output() eventEmitter:EventEmitter<any> = new EventEmitter();
  search(){
    this.eventEmitter.emit(this.query);
  }
  query: string = "";
}
