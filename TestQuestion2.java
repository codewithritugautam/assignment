package Assignment;
import java.util.*;
public class TestQuestion2 {
	public static void main(String[] args) {
	NavigableTest nset = new NavigableTest();
	nset.add("one");
	nset.add("two");
	nset.add("three");
	} }
	class NavigableTest extends
	TreeSet<Object> {public boolean
	test(Object value) {
	System.out.println(this.add(value));
	return super.add(value);
	}
	}
	