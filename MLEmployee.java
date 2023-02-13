package Assignment;

public class MLEmployee {
	float salary = 10000;
}
class programmer extends MLEmployee{
	int bonus = 5000;
	public static void main( String[] args) {
		Programmer p =new Programmer();
		System.out.println(" salary :" +p.salary);
		System.out.println(" bonus :"+p.bonus);
	}
}
