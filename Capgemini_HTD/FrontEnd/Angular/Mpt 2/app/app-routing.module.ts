import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AddPostComponent } from './add-post/add-post.component';
import { PostComponent } from './post/post.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'add-post', component: AddPostComponent},
  {path: 'post' , component: PostComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
