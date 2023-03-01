package Mypackage;

public class main3movie { //main class
	public static void main(String[] args) { //main method
		Movie m= new Movie();
		m.setMoviename("Mission Majnu"); // set the data
		m.setMoviestarttime("9:00 pm");
		m.setMovieEndtime("11:00 pm");
		m.setMovieTicketprice(250);
	System.out.println("movie name:"+m.getMoviename()); //get the data
	System.out.println("Startime:"+m.getMoviestarttime());
	System.out.println("Endtime:"+m.getMovieEndtime());
	System.out.println("movieTicket price"+m.getMovieTicketprice());
	}
}	
	
	
	
	
	
	
	
	
	
	
	


