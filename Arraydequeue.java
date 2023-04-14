package QueueIn;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class Arraydequeue {
	public static void main(String[] args) {
		//creating & adding
Deque<String>deque = new ArrayDeque<String>();
deque.add("Ritu");
deque.add("nisha");
deque.add("himanshi");
deque.add("nidhi");
deque.add("somu");
deque.offerFirst("gautam");
System.out.println("After offer First");
//traversing
for(String str:deque);
System.out.println(str1); }

	deque.offerLast("mohina");
	System.out.println("After offer last");
	//traversing
	for(String str1.deque) { 
		System.out.println(str1); }
	//deque.peek() & deque.peekFirstsame as peek()
	System.out.println("peek:" +deque.peek());
	System.out.println("poll first"+deque.pollFirst());
	System.out.println("poll last"+deque.pollLast());
	System.out.println("After poll");
	for(String str2.deque) {
		System.out.println(str2);
	}}}