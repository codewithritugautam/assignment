package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//transient keyword: used with data member of class in order to avoid serialization  
class Test implements Serializable { //create class
	transient int id; //make the id transient this will not serializable
	String name;
	public Test(int i , String n) {
		this.id=1;
		this.name=n;
	}}
public class Transient_keyword { //main class
public static void main(String[] args) {
	Test obj = new Test( 1, "Ritu");
	//Serialization
	FileOutputStream f = new FileOutputStream("E:\\4119.text");
	ObjectOutputStream o = new ObjectOutputStream(f); 
	o.writeObject(obj);
	o.flush();
	o.close();
	f.close();
	System.out.println("Done");
	// Deserialization
	ObjectInputStream oi = new ObjectInputStream(new FileInputStream ("E:\\4119.text"));
	Test obj1 = (Test)oi.readObject();
	System.out.println(obj1.id+" "+obj.name);
	oi.close();
}
 catch(Exception e) {
	System.out.println(e);
 }}
