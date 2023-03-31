package controlstatement;
import java.util.*;
public class Test2 {
public static void main(String[] str) {
	String s ="test1,test2,test3";
	Scanner scan = new Scanner(s).useDelimiter("test");
	System.out.print(scan.next());
	System.out.print(scan.next());
	System.out.print(scan.next());
	scan.close();
}
}
