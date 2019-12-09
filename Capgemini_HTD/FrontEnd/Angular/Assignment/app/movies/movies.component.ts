import { Component, OnInit } from '@angular/core';
import { Movie } from '../movie';


@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies: Movie[] = [
    {
      name: "URI- The Surgical Strike",
      imgURL: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTO3W101fvo8qcQFRUTzA0irPbHNw0mx7wmZghSF1bFiHW6TcIE1A&s',
      rating: '10/10',
      specs: `Major Vihaan Singh Shergill of the Indian Army leads a covert operation against a group of militants who attacked a
      base in Uri, Kashmir, in 2016 and killed many soldiers.`
    }, {
      name: "Charlie Chaplin",
      imgURL: 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      rating: '9/10',
      specs: `Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker,and composer who rose to 
      fame in the era of silent film. He became a worldwide icon through his screen persona, 
      "The Tramp", and is considered one of the most important figures in the history of the film industry.`
    }, {
      name: "Avengers",
      imgURL: 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      rating: '10/10',
      specs: `Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. 
    Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner
     must figure out a way to bring back their vanquished allies for an epic showdown.`
    }, {
      name: "Iron Man",
      imgURL: 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      rating: '8/10',
      specs: `When an industrialist is captured, he constructs a high-tech armoured suit to escape. 
  Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.`
    }, {
      name: "IT",
      imgURL: 'data:image/jpeg;base64,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',
      rating: '8/10',
      specs: `Defeated by members of the Losers' Club, the evil clown Pennywise returns 27 years later to terrorize the town of Derry,
       Maine, once again.Now adults, the childhood friends have long since gone their separate ways. But when people start disappearing, 
       Mike Hanlon calls the others home for one final stand.Damaged by scars from the past,the united Losers
        must conquer their deepest fears to destroy the shape-shifting Pennywise -- now more powerful than ever.`
    }
  ];

  selectedMovie: Movie=this.movies[0];
  selectMovie(movie){
    this.selectedMovie=movie;
  }

  constructor() { }

  ngOnInit() {
  }

}
