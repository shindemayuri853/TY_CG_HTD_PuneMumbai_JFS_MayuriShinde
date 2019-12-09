import { Component, OnInit } from '@angular/core';
import { PostService } from '../post.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-post',
  templateUrl: './add-post.component.html',
  styleUrls: ['./add-post.component.css']
})
export class AddPostComponent implements OnInit {

  constructor(private postService: PostService) { }
  submitForm(postForm: NgForm) {
    console.log(postForm.value);
    this.postService.postData(postForm.value).subscribe(resp => {
      console.log(resp);
      postForm.reset();
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
