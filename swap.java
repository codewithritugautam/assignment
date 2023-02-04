package thurdylab;

public class swap {
	public static void main(String[] args) {
		int x =10;
		int z =20;
		System.out.println("Before swap");
		System.out.println("x =" +x);
		System.out.println("z =" +z);
		int temp = x;
		x = z;
		z = temp;
		System.out.println("After swap");
		System.out.println(" x =" +x);
		System.out.println(" z = "+z);
	}
}
