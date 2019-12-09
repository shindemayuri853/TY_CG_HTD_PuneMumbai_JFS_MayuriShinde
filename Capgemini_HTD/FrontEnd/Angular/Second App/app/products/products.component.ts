import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products : Product []=[
    {name: 'MacBook',
    imageURL: 'https://cdn.pixabay.com/photo/2016/11/23/14/37/apple-1853259__340.jpg',
    price: 54999,
    details: 'Apple' 
    }, {name: 'Mobile',
    imageURL: 'https://cdn.pixabay.com/photo/2016/12/19/08/39/mobile-phone-1917737__340.jpg',
    price: 35000,
    details: 'Huwai'
    }, {name: ' Wireless Charger',
    imageURL: 'https://image.shutterstock.com/image-photo/touchscreen-smartphone-wireless-charging-on-260nw-1140224918.jpg',
    price: 10000,
    details: 'Samsung'
    }, {name: 'Wireless Headphones',
    imageURL: 'https://cdn.pixabay.com/photo/2017/08/06/12/54/headphones-2592263__340.jpg',
    price: 3000,
    details: 'Boat'
    }
  ]

  constructor() { }


  ngOnInit() {
  }

}
