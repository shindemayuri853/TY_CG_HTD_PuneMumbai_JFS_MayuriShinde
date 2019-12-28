import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BindingComponent } from './binding/binding.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { TwoWayDataBindingComponent } from './two-way-data-binding/two-way-data-binding.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { ProductsComponent } from './products/products.component';
import { ColorDirective } from './color.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { BikesComponent } from './bikes/bikes.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    BindingComponent,
    HeaderComponent,
    HomeComponent,
    TwoWayDataBindingComponent,
    StructuralDirectivesComponent,
    ProductsComponent,
    ColorDirective,
    ParentComponent,
    ChildComponent,
    BikeDetailsComponent,
    BikesComponent,
    LoginComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }