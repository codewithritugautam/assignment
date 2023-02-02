import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in); //Declare Scanner class
		System.out.println("enter the year");
		year=sc.nextInt();
				if(year%4==0) 
				{
			System.out.println("leap year");
				}
		else 
		{
			System.out.println("not leap year");
		}
			sc.close();
	}

}
