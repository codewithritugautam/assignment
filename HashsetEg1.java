package QueueIn;
import java.util.*;
public class HashsetEg1 {
public static void main(String[] args) {
	//creating Hashset and adding elements
	HashSet<String> set = new HashSet();
	set.add("ritu");
	set.add("riya");
	set.add("shivam");
	set.add("sana");
	set.add("sita");
	System.out.println("original list:" +set);
	//removing specific element from hash set
	set.remove("ram");
	HashSet<String>set1= new HashSet(); //set 2
	set1.add("richa");
	set1.add("Rahul");
	System.out.println("new set:"+set1);
	set.addAll(set1);
	System.out.println("update list:"+set);
	//remove all the new element
	set.removeAll(set1);
	//remove all
	set.clear();
	System.out.println("present list:"+set);
}
}
