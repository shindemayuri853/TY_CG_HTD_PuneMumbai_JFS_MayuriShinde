import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BindingComponent } from './binding/binding.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { TwoWayDataBindingComponent } from './two-way-data-binding/two-way-data-binding.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { ProductsComponent } from './products/products.component';
import { ParentComponent } from './parent/parent.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { LoginComponent } from './login/login.component';
import { BikesComponent } from './bikes/bikes.component';
import { RegisterComponent } from './register/register.component';


const routes: Routes = [
  {path: 'data-binding', component: BindingComponent},
  {path: '', component: HomeComponent},
  {path: 'header', component: HeaderComponent},
  {path: 'two-way-data-binding',component: TwoWayDataBindingComponent},
  {path: 'structural-directive', component: StructuralDirectivesComponent},
  {path: 'products',component: ProductsComponent},
  {path: 'parent', component: ParentComponent},
  {path: 'bikes', component: BikesComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
