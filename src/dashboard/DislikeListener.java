package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DislikeListener implements ActionListener {

	private int quoteIndex;
	private ArrayList<Quote> quotes;

	@Override
	public void actionPerformed(ActionEvent e) {
//			//if it's a like quote than just remove it from the like list and still show it sometimes
//			if(LikeListener.getLikeQuotes().size() != 0 && ((LikeListener.getLikeQuotes().contains(likeQuotes.get(NextQuoteListener.getLikeQuoteUpTo() - 1))&& NextQuoteListener.getType() == "like") 
//					|| (LikeListener.getLikeQuotes().contains(quotes.get(quoteUpTo - 1))&& NextQuoteListener.getType() == "Neutral") )){
//				if(NextQuoteListener.getType() == "like") {
//					if(likeQuotes.size() == 1) {
//						likeQuotes.remove(NextQuoteListener.getLikeQuoteUpTo());
//					}
//					else {
//						likeQuotes.remove(NextQuoteListener.getLikeQuoteUpTo() - 1);
//						NextQuoteListener.setLikeQuoteUpTo(NextQuoteListener.getLikeQuoteUpTo() - 1);
//					}
//					NextQuoteListener.setQuoteType("Neutral");
//				}
//				else {
//					if(likeQuotes.size() == 1) {
//						likeQuotes.remove(likeQuotes.indexOf(quotes.get(quoteUpTo)));
//					}
//					else {
//						likeQuotes.remove(likeQuotes.indexOf(quotes.get(quoteUpTo - 1)));
//					}
//					NextQuoteListener.setQuoteUpTo(quoteUpTo - 1); 
//					
//				}
//			} 
//			else {
		quotes.remove(quoteIndex - 1);

//				if(quotes.size() == 1) {
//					quotes.remove(quoteUpTo);
//				}
//				else {
//					quotes.remove(quoteUpTo - 1);
//					NextQuoteListener.setQuoteUpTo(quoteUpTo - 1);
//				}
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

	public void setQuoteIndex(int quoteIndex) {
		this.quoteIndex = quoteIndex;
	}

}