import { Component } from '@angular/core';

@Component({
  selector: 'ntap-notification-list',
  templateUrl: './notification-list.component.html',
  styleUrls: ['./notification-list.component.scss']
})
export class NotificationListComponent {
  notifications = [{ 
    'app' : "Ifood",
    'timestamp' : "há 17 minutos",
    'description' : "Kelvis chegou com seu pedido."
  }, {
    'app' : "Whatsapp",
    'timestamp' : "há 30 minutos",
    'description' : "Ageu: hype!"
  }, {
    'app' : "Youtube",
    'timestamp' : "há 2 horas",
    'description' : "Marombeiro Cientista fez um upload de um novo vídeo."
  },]
}
