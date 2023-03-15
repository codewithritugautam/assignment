package controlstatement;

public class DivideString { //class
public static void main(String[] args) {
	String s= "This a simple String";
	int n = 4; 
	int part  = s.length()/n;
	while(n!=0) {
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<part;i++) {
			sb.append(s.charAt(i)); // add character
		}
		System.out.println(sb);
		s= s.substring(part);
			n--;
		}
	}
}

