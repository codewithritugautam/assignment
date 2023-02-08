package Assignment;

import java.util.Scanner;

public class factorial1 {
public static void main(String[] args) {
	System.out.println("Enter the value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	factorial(n);
}
public static void factorial(int n) {
	int fact= 1;
	for(int   i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(n+"factorial "+ fact);
}
}
