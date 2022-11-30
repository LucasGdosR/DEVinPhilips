import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ClassFormComponent } from './components/class-form/class-form.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ItemCardComponent } from './components/item-card/card.component';

@NgModule({
  declarations: [
    AppComponent,
    ClassFormComponent,
    NavbarComponent,
    ItemCardComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
