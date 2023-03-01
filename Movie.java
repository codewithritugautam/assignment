package Mypackage;

public class Movie {
private String moviename;
private String moviestarttime;
private String movieEndtime;
private int movieTicketprice;
public int getMovieTicketprice() {
	return movieTicketprice;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getMoviestarttime() {
	return moviestarttime;
}
public void setMoviestarttime(String moviestarttime) {
	this.moviestarttime = moviestarttime;
}
public String getMovieEndtime() {
	return movieEndtime;
}
public void setMovieEndtime(String movieEndtime) {
	this.movieEndtime = movieEndtime;
}
public void setMovieTicketprice(int movieTicketprice) {
	this.movieTicketprice = movieTicketprice;
}
}