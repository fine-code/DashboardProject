package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	  public static void main(String[] args) {
		  
		  Quote quote1 = new Quote("My style is unique and random. But I think it's important that it still makes sense. ", "Jess", "Glynne");
		  Quote quote2 = new Quote("Your limitation - it's only your imagination. ","","Anonymous");
		  Quote quote3 = new Quote("Goals transform a random walk into a chase. ", "Mihaly","Csikszentmihalyi");
		  Quote quote4 = new Quote("Everything happening around me is very random. I am enjoying the phase, as the journey is far more enjoyable than the destination. ", "Susan Singh", "Rajput");
		  Quote quote5 = new Quote("Carry out a random act of kindness, with no expectation of reward, safe in the knowledge that one day someone might do the same for you. ", "Princess", "Diana");
		 
		  
		  List<Quote> quotes = new ArrayList<Quote>();
		  quotes.add(quote1);
		  quotes.add(quote2);
		  quotes.add(quote3);
		  quotes.add(quote4);
		  quotes.add(quote5);
		  		  
		  //establish a Controller
		  Controller runtime = new Controller();
		  runtime.getQuotes().addAll(quotes);
	  
		  Window w = new Window(runtime);
		
	  }
	
}
