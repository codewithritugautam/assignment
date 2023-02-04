package controlstatement;

public class Triangle {
	public static void main(String[]args) {
		for(int i=1; i<=5; i++)  // outer loop for row number
		{
			for ( int j=5; j>i;  j--) // inner loop for print space before star*
			{
			System.out.print(" ");
			}
				for( int k =1; k<=i; k++)
				{
					System.out.print(" * ");
				}
				System.out.println();//new line		
			}
			}
	
	}

