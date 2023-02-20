package Assignment;
class Supercon {
	String Day =" sunday";
	}
	 class weaksname extends Supercon {
		String Day="saturday";
		void printDay() {
			System.out.println(Day); // print Day name 
			System.out.println(super.Day);
		}
	}
	class Super{
		public static void main(String args[]) {
			weaksname d = new weaksname();
			d.printDay();
		}
	}


