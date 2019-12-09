import { Component, OnInit } from '@angular/core';
import { PostService } from '../post.service';
import { Post } from 'src/post';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  constructor(private postService: PostService) { }
  // getPost(post: Post) {
  //   this.postService.getData(post.value)
  // }

  deletePost(post: Post) {
    this.postService.deleteData(post).subscribe(response => {
      console.log(response);
      console.log('delete one employee');
      // To update table after Deleting Data
      this.postService.getData();
    }, err => {
      console.log(err);
    });
  }


  ngOnInit() {
  }

}
