package controlstatement;

import java.util.Scanner;

public class Days {
	 public static void main(String[] args) {
		 // to do auto-generated method stub
		 // here a year is in from of minute 
		 Scanner input = new Scanner(System.in);
		 System.out.print(" Input the time" + " of minutes:");
		 int min= input.nextInt();
		 int year1=60*24*365;
		 //hear the min will convert in the year;
		 int years = (min / year1);
		 // and minute will convert in the sday
		 int days = ( min / 60 /24 ) % 365;
		 System.out.println(" years :" + years + " days :" + days);
	 }

}
