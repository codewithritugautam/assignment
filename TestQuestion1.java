package Assignment;
import java.util.*;
public class TestQuestion1 {
	
	
	public static void main(String[] args) {
	NavigableSet <Integer> nset = new
	TreeSet<Integer>();nset.add(10);
	nset.add(15);
	nset.add(7);
	Iterator descendingIterator =
	nset.descendingIterator();
	if(descendingIterator.hasNext()) {
	System.out.println(descendingIterator.next());
	}
	}
}
	
