package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class LikeListener implements ActionListener {

	// private static ArrayList<Quote> likeQuotes = new ArrayList<>();
	private static ArrayList<Quote> quotes;
	private int quoteIndex;

	@Override
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

	public void setQuotes(ArrayList<Quote> q) {
		quotes = q;
	}

}
