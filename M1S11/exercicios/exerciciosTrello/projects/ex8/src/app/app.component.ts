import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'ToDoApp';
  taskToAdd : string = '';
  taskList : string[] = [];

  addTask() {
    this.taskList.push(this.taskToAdd);
    this.taskToAdd = '';
  }
}
