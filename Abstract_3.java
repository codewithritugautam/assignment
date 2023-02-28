package Assignment;
abstract class Shapes_2{
	abstract void calculateArea();
	}
class Circle extends Shapes_2 {
	void calculateArea() {
		int radius=3;
		double Radius=3.14*radius*radius;
		System.out.println("The area of circle is: "+Radius);
	}
}
class Rectangle_1 extends Shapes_2 {
	void calculateArea() {
		int lenght=10,breath=4;
		int area=lenght+breath;
		System.out.println(" the area of rectangle is:"+area);
	}
}

public class Abstract_3 {
public static void main(String[] args ) {
	Shapes_2 obj=new Circle();
	obj.calculateArea();
	Shapes_2 obj1=new Rectangle_1 ();
	obj1.calculateArea();
}
}
