package Thread;

public class Assignment_28March extends Thread {
	public static void main(String[] args) {
		Assignment_28March t=new Assignment_28March();
		t.start();
		t.setName("ThreadTest1");
		String s=t.getName();
//	System.out.println("ACBACBACBACB A CABCABCABCABCAB CB");
		for(int i=0;i<5;i++ ) {
			System.out.print("ACB");
		}
		System.out.print("A");
		
		for(int i=0;i<6;i++) {
			System.out.print("CAB");
		}
		
		System.out.print("CB");


	}

}

