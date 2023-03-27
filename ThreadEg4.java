package Thread;
public class ThreadEg4 {
	public static void main(String[] args) {
	//creating an object of the thread class saving the thread constructor
	Thread t = new Thread ("Richa");
	Thread t1 = new Thread ("Gautam");
	t.start(); //save the active state 
	t1.start();
	System.out.println("Thread 1 : " + t.getName()); //print thread1 - richa 
	System.out.println("Thread 2 : "+ t1.getName()); //print thread2 - gautam
}}
