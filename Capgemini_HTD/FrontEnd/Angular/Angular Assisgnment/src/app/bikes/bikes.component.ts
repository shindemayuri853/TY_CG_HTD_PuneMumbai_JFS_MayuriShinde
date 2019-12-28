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
      brand: 'Harley-davidson',
      imgURL: 'https://cdn.pixabay.com/photo/2015/04/10/15/27/harley-716352__340.jpg',
      model: 'street 750',
      price: 500000,
      specs: `The Harley-Davidson Street motorcycle series was announced by Harley-Davidson at the 2013 EICMA show in Milan for 2014 
      introduction, Harley's first all-new models in 13 years, including Harley's first 
      lightweight motorcycle since the 1974 Sprint.`

    }, {
      brand: 'Royal Enfield',
      imgURL: 'https://cdn.pixabay.com/photo/2017/11/23/04/08/royal-enfield-2972008__340.jpg',
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

    }, {
        brand: 'Bugati',
        imgURL: 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
        model: 'Aventador',
        price: 200000,
        specs: `The Petrol engine is 6498 cc. It is available with the Automatic transmission. 
        Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl.
         The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.`
  
      }, {
        brand: 'BMW',
        imgURL: 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
        model: '1994',
        price: 200000,
        specs: `The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer.The Diesel engine is 1248
         cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a 
         mileage of 22.0 to 28.4 kmpl.The Swift is a 5 seater Hatchback and has a length of 3840mm.`
      }, {
        brand: 'Suzuki',
        imgURL: 'https://cdn.pixabay.com/photo/2018/09/30/17/50/motorcycle-3714059__340.jpg',
        model: '1885',
        price: 200000,
        specs: `The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while
         the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a 
         mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm..`
      },  {
        brand: 'Mercedes-Benz E-Class',
        imgURL: 'https://cdn.pixabay.com/photo/2017/07/17/05/45/harley-2511451__340.jpg',
        model: '2015',
        price: 200000,
        specs: `The Mercedes-Benz E-Class has 2 Diesel Engine and 2 Petrol Engine on offer.
         Depending upon the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. 
         The E-Class is a 5 seater Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm.`
      }
];

  selectedBike: Bike= this.bikes[0];

  selectBike(bike) {
    this.selectedBike = bike;
  }

  constructor() { }

  ngOnInit() {
  }

}
