import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
    selector: '[appColor]',
})
export class ColorDirective{
    constructor(private el: ElementRef){
        this.el.nativeElement.style.backgroundColor='red';
        this.el.nativeElement.style.color='white';
        this.el.nativeElement.style.padding='5px';
    }

    @HostBinding('style.fontSize') fontsize;
    @HostListener('mouseenter')
    mouseEnter(){
        console.log('Mouse Enter');
        this.fontsize='50px';
        this.el.nativeElement.style.backgroundColor='blue';

    }

    @HostListener('mouseleave')
    mouseLeave(){
        console.log('Mouse Leave');
        this.el.nativeElement.style.backgroundColor='black';

    }
   

}