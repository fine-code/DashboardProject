package app;
import java.util.ArrayList;
import java.util.List;

/**
 * Everytime the user switching to the next quote we completely recreate the panel and all the listeners 
 * and assign them the index of the current quote?  
 * 
 * If so, it would be better to have a central controller 
 * that keeps track of which index we are up to and uses that when performing like/dislike operations.  
 * We should not continually create/destroy the panels and listeners.
 * 
 * 
 * It is going to be difficult, if not impossible to unit test this.  
 * Create a "Controller" class.  
 * The controller class should call methods on the Window to add the various listeners.  
 * The Window class itself should implement an interface.  
 * That way, you can create some type of "mock" version of the Window. 
 *  Most of the actual logic should be in the controllers and or the listeners.  
 * (I think you already do have most of the logic in the listeners)
 * 
 * 
 * 
 * 
 * @author chana
 *
 */
public class Controller {
	
	private List<Quote> quotes = new ArrayList<Quote>();
	private int quoteIndex;
	
	public List<Quote> getQuotes() {
		return quotes;
	}
	
	public int getQuoteIndex() {
		return quoteIndex; 
	}  

	public void incrementQuoteIndex() {
		quoteIndex++;
	}

}
