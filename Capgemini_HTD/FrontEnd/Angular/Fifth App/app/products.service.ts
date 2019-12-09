import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from 'src/product';


@Injectable({
  providedIn: 'root'
})
export class ProductsService {
    api = 'https://assignment-fae36.firebaseio.com/';
    products: Product [] = [];

  constructor(private http: HttpClient) { }

  postData(data) {
   return this.http.post(`${this.api}products.json`, data);
  }

  getData() {
    this.http.get(`${this.api}products.json`).subscribe(data => {
      console.log(data);
      const productsArray = [];
      for (const key in data) {
        if (data.hasOwnProperty(key)) {
          productsArray.push({...data[key], pk: key});
        }
      }
      this.products = productsArray;
      console.log(this.products);
    });
}

    deleteData(product) {
      return this.http.delete(`${this.api}products/${product.pk}.json`);
      }

      putData(data) {
        return this.http.put(`${this.api}products/${data.pk}.json`, data);
      }
  }

