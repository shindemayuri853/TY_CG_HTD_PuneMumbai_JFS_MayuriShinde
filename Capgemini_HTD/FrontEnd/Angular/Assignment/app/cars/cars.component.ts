import { Component, OnInit } from '@angular/core';
import { Car } from '../car';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
  cars: Car[] = [
    {
      brand: 'Lamborghini',
      imgURL: 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      model: '2010',
      price: 500000,
      specs: `The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc
       while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl.
        The Swift is a 5 seater Hatchback and has a length of 5000.`
    }, 
    {
      brand: 'Maruti',
      imgURL: 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
      model: '1994',
      price: 500000,
      specs: `The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine 
      is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. 
      The Swift is a 5 seater Hatchback and has a length of 3840mm.`

    },  
    {
      brand: 'Suzuki',
      imgURL: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
      model: '1885',
      price: 500000,
      specs: `The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer.The Diesel engine is 1248 cc while the kersine engine
       is 466 cc.Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl.
         The Suzuki is a 5 seater Hatchback and has a length of 3840mm.`
    }, 
     {
      brand: 'Lamborghini Aventador',
      imgURL: 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      model: '2015',
      price: 500000,
      specs: `The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador
       has a mileage of 5.0 to 7.69 kmpl.The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.`
    }
  ];

  selectedCar: Car= this.cars[0];

  selectCar(car) {
    this.selectedCar = car;
  }

  constructor() { }

  ngOnInit() {
  }

}
