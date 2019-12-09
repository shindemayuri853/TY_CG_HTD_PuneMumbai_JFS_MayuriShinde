import { Pipe, PipeTransform } from '@angular/core';
import { Employee } from './employee';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(employee:Employee[], search: string): Employee[] {
    if (search === undefined){
      return employee;
    } else {
      return employee.filter((value,index,array)=>{
        return value.name.toLowerCase().includes(search.toLowerCase());
      })
    }
   
  }

}
 