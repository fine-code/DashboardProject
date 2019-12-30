package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DislikeListener implements ActionListener {

	private int quoteIndex;
	private ArrayList<Quote> quotes;

	@Override
	public void actionPerformed(ActionEvent e) {

		if(quotes.size() == 1) {
			quotes.remove(0);
		}else if(quoteIndex == 0) {
			quotes.remove(quotes.size() - 1);
		}else {
			quotes.remove(quoteIndex - 1);
			NextQuoteListener.setquoteIndex(quoteIndex - 1);
		}
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

	public void setQuoteIndex(int quoteIndex) {
		this.quoteIndex = quoteIndex;
	}

}