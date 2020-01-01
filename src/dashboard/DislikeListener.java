package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class DislikeListener implements ActionListener {

	private int quoteIndex;
	private ArrayList<Quote> quotes;
	private JButton dislike;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(quotes.size() == 1) {
			quotes.remove(0);
		}else if(quoteIndex == 0 && quotes.size() !=0) {
			quotes.remove(quotes.size() - 1);
		}else if(quotes.size() != 0){
			quotes.remove(quoteIndex - 1);
			NextQuoteListener.setquoteIndex(quoteIndex - 1);
		}
		dislike.setEnabled(false);
		
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

	public void setQuoteIndex(int quoteIndex) {
		this.quoteIndex = quoteIndex;
	}
	public void setButton(JButton dislike) {
		this.dislike = dislike;
	}

}