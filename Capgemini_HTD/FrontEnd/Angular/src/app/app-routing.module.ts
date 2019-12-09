import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AddProdutComponent } from './add-produt/add-produt.component';
import { ViewProductComponent } from './view-product/view-product.component';
import { AuthGuard } from './auth.guard';


const routes: Routes = [
  { path: '', component: HomeComponent },
  {
    path: 'add-product', component: AddProdutComponent,
    canActivate: [AuthGuard],
    data: { expectedRole: ['admin'] }
  },
  {
    path: 'view-products', component: ViewProductComponent,
    canActivate: [AuthGuard],
    data: { expectedRole: ['admin', 'user'] }
  },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
