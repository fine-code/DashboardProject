package dashboard;

import java.util.ArrayList;

public class Main {

	  public static void main(String[] args) {
		  //create an ArrayList of quotes
		  ArrayList<Quote> quotes = new ArrayList<>();
		  Person author1 = new Person("Jess","Glynne ");
		  Person author2 = new Person("","Anonymous");
		  Person author3 = new Person("Mihaly","Csikszentmihalyi");
		  Person author4 = new Person("Susan Singh", "Rajput");
		  Person author5 = new Person("Princess", "Diana");
		  
		  Quote quote1 = new Quote("My style is unique and random. But I think it's important that it still makes sense. ",author1);
		  Quote quote2 = new Quote("Your limitation - it's only your imagination. ",author2);
		  Quote quote3 = new Quote("Goals transform a random walk into a chase. ", author3);
		  Quote quote4 = new Quote("Everything happening around me is very random. I am enjoying the phase, as the journey is far more enjoyable than the destination. ", author4);
		  Quote quote5 = new Quote("Carry out a random act of kindness, with no expectation of reward, safe in the knowledge that one day someone might do the same for you. ",author5);
		 
		  quotes.add(quote1);
		  quotes.add(quote2);
		  quotes.add(quote3);
		  quotes.add(quote4);
		  quotes.add(quote5);
		  		  
		  //create the window
		  Window w = new Window(quotes);
		  w.createAndDisplayWindow(quotes);
		  
	  }
}
