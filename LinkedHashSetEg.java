package QueueIn;
import java.util.*;
public class LinkedHashSetEg {
//allowing null method 
	public static void main(String[] args) {
		Set<String> s4 = new LinkedHashSet<String>();
		s4.add("pen");
		s4.add("pencil");
		s4.add("mouse");
		s4.add("phone");
		s4.add(null); //allow null element
		s4.add("Ac");
		s4.add("bottle");
		s4.add("Earphne");
		s4.add("pen"); //not allowing duplicate
		Iterator<String> itr = s4.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
