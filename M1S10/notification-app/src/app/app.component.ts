import { Component } from '@angular/core';

@Component({
  selector: 'ntap-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'notification-app';
  reroute(readUnreadAll: string){
    switch (readUnreadAll) {
      case "all":
        console.log("Filtrando todos");
        break;
      case "read":
        console.log("Filtrando apenas lidos");
        break;
      case "unread":
        console.log("Filtrando apenas não lidos");
        break;
    }
  }
}
