package thurdylab;

import java.util.Scanner;

public class Avaragenumber {

	// main method
	public static void main(String[] args) {
		int num1=10;
		System.out.println("Enter the first number is: "+num1);//enter the first number
		int num2=20;
		System.out.println("Enter the number is: "+num2); //enter the second number
		int num3=30;
		System.out.println("Enter the number is: "+num3); //enter the third number
		int num4=40;
		System.out.println("Enter the number is: "+num4); //enter the forth number
		int num5=50;
		System.out.print("Enter the number is:"+num5);  //enter the fifth number
		int sum;
		int avarage;
		sum=(num1+num2+num3+num4+num5);
		//print the output
		avarage=sum/5;
		System.out.println(" The avarage of the number are: "+avarage);
	  }
 }
