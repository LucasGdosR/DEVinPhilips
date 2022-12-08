import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NotificationListComponent } from './components/notification-list/notification-list.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { FilterComponent } from './components/filter/filter.component';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    NotificationListComponent,
    HeaderComponent,
    FooterComponent,
    FilterComponent,
    HomeComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path:'', redirectTo:'home', pathMatch:'full' },
      { path:'home', component:HomeComponent },
      { path:'home:lido', component:HomeComponent},
      { path:'about', component:AboutComponent },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
