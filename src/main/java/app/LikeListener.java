package app;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class LikeListener implements ActionListener {

	// private static ArrayList<Quote> likeQuotes = new ArrayList<>();
	private static List<Quote> quotes;
	private int quoteIndex;
	private Controller ctrl;

	public LikeListener(Controller c) {
		this.ctrl = c;
	}

	public void actionPerformed(ActionEvent e) {
		if(quotes.size() > 1) {
			quotes.add(quotes.get(quoteIndex - 1));
		}else {
			quotes.add(quotes.get(quoteIndex));
		}
	}

	public void setQuoteIndex(int quoteUpTo) {
		this.quoteIndex = quoteUpTo;
	}

	public void setQuotes(List<Quote> quotesList) {
		quotes = quotesList;
	}

}
