package thurdylab;

import thurdylab.ObjectEg;

class ObjectEg {
	//instance variable
		int id;
		String name;
	}
	class object { //main class
		public static void main(String[] args) {
			ObjectEg obj=new ObjectEg(); //create object -- obj is out  ref variable
			obj.id=1;
			obj.name="ritu";
			System.out.println(obj.id+" " +obj.name); //printing number with a white space
		}
	}


