package IO;
import java.io.ByteArrayInputStream;
//read byte array as input stream
public class ByteArray { //class
public static void main(String[] args) {
	byte [] arr = {68,37,35,70,39}; //byte array
	ByteArrayInputStream bin = new ByteArrayInputStream(arr);
	int i = 0; //integer type variable
	while ((i=bin.read())!= -1) {
		char ch = (char)i; //converting into character
		System.out.println("ASCII character " + i+ " "+" value is "+ch);
	}
}
}
