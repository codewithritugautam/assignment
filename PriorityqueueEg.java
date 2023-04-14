package QueueIn;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityqueueEg {
public static void main(String [] args) {
	PriorityQueue<String> queue = new PriorityQueue<String>();
	queue.add("Ritu");
	queue.add("Rahul");
	queue.add("sana");
	queue.add("megha");
	queue.add("radha");
	queue.add("veena");
	queue.add("nisha");
	System.out.println("head :" +queue.element());
	System.out.println("Queue:"+queue);
	System.out.println("head:"+queue.peek());
	System.out.println("Queue:"+queue);
	System.out.println("Iterating the elements");
	Iterator<E> itr = queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()); }
	System.out.println("head: "+queue.poll());
	System.out.println("Queue:" +queue.remove());
	System.out.println("head:"+queue.peek());
	System.out.println("Queue:"+queue);
	System.out.println("after removing");
	
	}
}

