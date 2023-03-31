package controlstatement;

public class Test1 {
	public enum Cars{ferari,maruti,omni};
public static void main(String args[] ) {
Cars mycar=Cars.ferari;
switch(mycar) {
case ferari:
	System.out.print("ferari");
	default :
		System.out.print("mercadi");
	case maruti:
		System.out.print("meruti");
}
}
}
