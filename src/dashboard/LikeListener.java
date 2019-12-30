package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class LikeListener implements ActionListener {
	private JButton like;
	// private static ArrayList<Quote> likeQuotes = new ArrayList<>();
	private static ArrayList<Quote> quotes;
	private int quoteIndex;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == like) {
			quotes.add(quotes.get(quoteIndex - 1));
		}
	}

	public void setLike(JButton like) {
		this.like = like;
	}

	public void setQuoteIndex(int quoteUpTo) {
		this.quoteIndex = quoteUpTo;
	}

	public void setQuotes(ArrayList<Quote> q) {
		quotes = q;
	}

}
