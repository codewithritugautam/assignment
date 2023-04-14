package QueueIn;
import java.util.*;
public class Dequeue {
public static void main(String[] args) {
	Deque<String>dq= new ArrayDeque<String>();
    dq.add("ram");
    dq.add("nidhi");
    dq.add("mona");
    dq.add("ajay");
    dq.add("somu");
    dq.add("gyan");
    dq.add("nirur");

    System.out.println(dq);
    dq.addFirst("Somu");
    dq.addLast("Ritu");
    System.out.println("New list");
    for(String s1 : dq) {
    	System.out.println(s1);
    }
    dq.removeFirst();
    dq.removeLast();
    System.out.println("new kist");
    for(String s2 :dq);
    dq.removeFirst();
    dq.removeLast();
    System.out.println("new list after removal");
    for(String s2:dq) {
    	System.out.println(s2);
	}
}
}
