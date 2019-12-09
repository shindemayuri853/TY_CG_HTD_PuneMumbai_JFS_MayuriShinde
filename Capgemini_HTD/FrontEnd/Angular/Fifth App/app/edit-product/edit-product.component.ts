import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../products.service';
import { Product } from 'src/product';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  constructor(public productService: ProductsService) {
    this.productService.getData();
   }

 selectedProduct: Product = {
   productCategory : null,
         productImage : null,
         productName: null,
         productPrice: null,
         productDetails: null,
 };

   deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe(resp => {
      console.log(resp);
      console.log('Data Deleted');
      this.productService.getData();
    }, err => {
      console.log(err);
    });

}

selectProduct(product: Product) {
this.selectedProduct = product;
}

addProduct(form: NgForm) {
  this.productService.putData(form.value).subscribe(response => {
    console.log(response);
    form.reset();
  }, err => {
    console.log(err);
  } );
}

ngOnInit() {
}
}
