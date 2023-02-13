package Assignment;

class Shape {
	public void display() {
		System.out.println(" sqare ");
	}
}
class Rectangle extends Shape {
	public void area() {
		System.out.println(" circle ");
	}
}
public class Tester {
	public static void main( String[] args)
	{
	Rectangle rect = new Rectangle ();
	rect.display();
	rect.area();
}
}
