import { Component } from '@angular/core';
import { Router } from "@angular/router";

@Component({
  selector: 'ntap-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  constructor(private router: Router){}
  reroute(readUnreadAll: string){
    this.router.navigate(['home', readUnreadAll]);
  }
}
