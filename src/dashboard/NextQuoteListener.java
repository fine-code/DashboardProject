package dashboard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class NextQuoteListener implements ActionListener {
	private JButton nextQuote;
	private JLabel textLabel;
	private JFrame frame;
	private static ArrayList<Quote> quotesList;
	private static int quoteUpTo = 0;
	// private static String quoteType = "";
	// private static int likeQuoteUpTo = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextQuote) {
			JPanel nextQuotepanel = new JPanel();
			nextQuotepanel.setBackground(Color.black);
			displayQuote();
			nextQuotepanel.add(textLabel, BorderLayout.LINE_START);

			reactionButtons(nextQuotepanel);
			displayPanel(nextQuotepanel);
		}

	}

	private void displayQuote() {

		displayRegularQuote();
		quoteUpTo++;
		if (quoteUpTo > quotesList.size() - 1) {
			quoteUpTo = 0;
		}
	}

	private void displayPanel(JPanel nextQuotepanel) {
		frame.getContentPane().add(nextQuotepanel, BorderLayout.CENTER);
		frame.setContentPane(nextQuotepanel);
		frame.pack();
		nextQuotepanel.setVisible(true);
	}

	private void reactionButtons(JPanel nextQuotepanel) {
		JButton like = new JButton("Like");
		JButton dislike = new JButton("Dislike");
		buttonStyles(like, dislike); // dimensions where the button should go.

		nextQuotepanel.add(like);
		nextQuotepanel.add(dislike);

		DislikeListener dislikeClicked = dislikeAction(dislike);
		LikeListener likeClicked = likeActions(like);

		like.addActionListener(likeClicked);
		dislike.addActionListener(dislikeClicked);
	}

	private void displayRegularQuote() {
		textLabel = new JLabel("<html>" + quotesList.get(quoteUpTo).toString() + "</html>", SwingConstants.CENTER);
		textLabel.setFont(new Font("Magneto Bold", Font.BOLD, 20));
		textLabel.setPreferredSize(new Dimension(1000, 100));
		textLabel.setForeground(Color.CYAN);
	}

	private LikeListener likeActions(JButton like) {
		LikeListener likeClicked = new LikeListener();
		likeClicked.setLike(like);
		likeClicked.setQuoteUpTo(quoteUpTo);
		likeClicked.setQuotes(quotesList);
		return likeClicked;
	}

	private void buttonStyles(JButton like, JButton dislike) {
		like.setBackground(Color.cyan);
		like.setBounds(500, 400, 100, 40); // dimensions where the button should go
		dislike.setBackground(Color.cyan);
		dislike.setBounds(800, 400, 100, 40);
	}

	private DislikeListener dislikeAction(JButton dislike) {
		DislikeListener dislikeClicked = new DislikeListener();
		dislikeClicked.setDislike(dislike);
		dislikeClicked.setQuoteUpTo(quoteUpTo);
		dislikeClicked.setQuotes(quotesList);
		return dislikeClicked;
	}

	public void setNextQuote(JButton nextQuote) {
		this.nextQuote = nextQuote;
	}

	public JButton getNextQuote() {
		return nextQuote;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public static void setQuotes(ArrayList<Quote> quotes) {
		quotesList = quotes;
	}

	public ArrayList<Quote> getQuotes() {
		return quotesList;
	}

	public void setTextLabel(JLabel textLabel) {
		this.textLabel = textLabel;
	}

	public JLabel getTextLabel() {
		return textLabel;
	}

//	public static int getLikeQuoteUpTo() {
//		return likeQuoteUpTo;
//	}
	public static void setQuoteUpTo(int q) {
		quoteUpTo = q;
	}
//	public static String getType() {
//		return quoteType;
//	}
//
//	public static void setLikeQuoteUpTo(int i) {
//		likeQuoteUpTo = i;
//	}
//	public static void setQuoteType(String type) {
//		quoteType = type;
//	}

}
