import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { notifications } from './notifications';

@Component({
  selector: 'ntap-notification-list',
  templateUrl: './notification-list.component.html',
  styleUrls: ['./notification-list.component.scss']
})
export class NotificationListComponent implements OnInit {
  notifications = notifications;
  todosLidoNaoLido: string = '';
  constructor(private route: ActivatedRoute){}

  ngOnInit(): void {
      this.route.params.subscribe(filtro => this.todosLidoNaoLido = filtro['todosLidoNaoLido'])
  }

  read(notification: { lido: boolean}){
    notification.lido = true;
  }

  // capturar a variável do path todosLidoNaoLido
}
