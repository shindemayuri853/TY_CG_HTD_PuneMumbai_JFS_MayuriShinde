import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../products.service';
import { Product } from 'src/product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(public productService: ProductsService) {
    this.productService.getData();
   }
  ngOnInit() {
  }

}
