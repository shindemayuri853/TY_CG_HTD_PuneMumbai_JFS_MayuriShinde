import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RegisterComponent } from './register/register.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { BikesComponent } from './bikes/bikes.component';
import { CarsComponent } from './cars/cars.component';
import { PlanesComponent } from './planes/planes.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    ContactUsComponent,
    RegisterComponent,
    AboutUsComponent,
    PageNotFoundComponent,
    BikesComponent,
    CarsComponent,
    PlanesComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: '',component: HomeComponent},
      {path: 'about-us',component: AboutUsComponent,children:[
        {path: 'bikes',component: BikesComponent},
        {path:'cars',component: CarsComponent},
        {path: 'planes',component: PlanesComponent}
      ]},
      {path: 'contact-us', component: ContactUsComponent},
      {path: 'login', component: LoginComponent},
      {path: 'register', component: RegisterComponent},
      {path: '**',component: PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
