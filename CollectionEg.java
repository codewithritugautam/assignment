package CollectionEg;
	import java.util.*;
	public class CollectionEg {
public static void main(String[] args) {

	NavigableSet <Integer> ns = new TreeSet<Integer>();

	ns.add(10);

	ns.add(15);

	ns.add(7);

	Iterator descendingIterator = ns.descendingIterator();

	if(descendingIterator.hasNext()) {

	System.out.println(descendingIterator.next());

	}
	}
	}
