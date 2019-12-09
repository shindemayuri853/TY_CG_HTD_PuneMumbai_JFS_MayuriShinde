import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {


  bikes: Bike[] = [
    {
      brand: 'harley-davidson',
      imgURL: 'https://cdn.pixabay.com/photo/2019/10/19/19/15/motorcycle-4562069__340.jpg',
      model: 'street 750',
      price: 500000,
      specs: `The Harley-Davidson Street motorcycle series was announced by Harley-Davidson at the 2013 EICMA show in Milan for 2014 
      introduction, Harley's first all-new models in 13 years, including Harley's first 
      lightweight motorcycle since the 1974 Sprint.`

    }, {
      brand: 'Royal Enfield',
      imgURL: 'https://cdn.pixabay.com/photo/2019/10/19/19/15/motorcycle-4562069__340.jpg',
      model: 'street 750',
      price: 160000,
      specs: `The Harley-Davidson Street motorcycle series was announced by Harley-Davidson at the 2013 EICMA show in Milan for 2014 
    introduction, Harley's first all-new models in 13 years, including Harley's first 
    lightweight motorcycle since the 1974 Sprint.`

    }, {
      brand: 'Honda',
      imgURL: 'https://cdn.pixabay.com/photo/2019/10/19/19/15/motorcycle-4562069__340.jpg',
      model: 'street 750',
      price: 200000,
      specs: `The Harley-Davidson Street motorcycle series was announced by Harley-Davidson at the 2013 EICMA show in Milan for 2014 
  introduction, Harley's first all-new models in 13 years, including Harley's first 
  lightweight motorcycle since the 1974 Sprint.`

    }];

  selectedBike: Bike = this.bikes[0];

  selectBike(bike) {
    this.selectedBike = bike;
  }


  constructor() { }


  ngOnInit() {
  }

}
