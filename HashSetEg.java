package QueueIn;
import java.util.*;
public class HashSetEg {
//allowed null value
	public static void main(String[] args) {
		Set<String> s4 = new HashSet<String>();
		s4.add("Ac");
		s4.add("pencil");
		s4.add("mouse");
		s4.add("phone");
		s4.add(null); //allow null element
		s4.add("Ac");
		s4.add("bottle");
		s4.add("pen");
		Iterator<String> itr = s4.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
