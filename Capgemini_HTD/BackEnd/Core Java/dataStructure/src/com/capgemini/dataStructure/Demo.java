package com.capgemini.dataStructure;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Enter Size of array");
		Scanner s = new Scanner(System.in);
		int[] a= new int[s.nextInt()];
		
		for(int i = 0; i< a.length; i++ ){
			System.out.println("Enter Element");
			a[i] = s.nextInt();
			System.out.println(a[i]);
		}
		for(int i=0 ; i<a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a.length; ) {
			
		}
	}
	}
}// end of class
