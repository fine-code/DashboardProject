package dashboard;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public Window(ArrayList<Quote> quotes) {

	}

	public void createAndDisplayWindow(ArrayList<Quote> quotes) {

		JFrame frame = setUpFrame();
		JMenuBar menuBar = new JMenuBar();

		JButton nextQuote = new JButton("Next Quote");
		JButton displayQuote = new JButton("Display All Quotes");
		JButton addQuote = new JButton("Add a Quote");
		setUpMenu(menuBar, nextQuote, displayQuote, addQuote);

		addQuoteButtonActions(quotes, frame, addQuote);
		displayQuotesButtonActions(quotes, frame, displayQuote);
		nextQuoteButtonActions(quotes, frame, nextQuote);

		displayFrame(frame, menuBar);

	}

	private void displayFrame(JFrame frame, JMenuBar menuBar) {
		frame.setJMenuBar(menuBar);
		frame.pack();
		frame.setVisible(true);
	}

	private JFrame setUpFrame() {
		JFrame frame = new JFrame("Inspirational Quotes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.cyan));
		return frame;
	}

	private void setUpMenu(JMenuBar menuBar, JButton nextQuote, JButton displayQuote, JButton addQuote) {
		menuBar.add(nextQuote);
		menuBar.add(displayQuote);
		menuBar.add(addQuote);
		menuBar.setBackground(Color.cyan);
	}

	private void addQuoteButtonActions(ArrayList<Quote> quotes, JFrame frame, JButton addQuoteButton) {
		AddQuoteListener addQuoteAction = new AddQuoteListener();

		addQuoteAction.setQuotes(quotes);
		addQuoteAction.setFrame(frame);
		addQuoteButton.addActionListener(addQuoteAction);
	}

	private void nextQuoteButtonActions(ArrayList<Quote> quotes, JFrame frame, JButton nextQuoteButton) {
		NextQuoteListener quoteClicked = new NextQuoteListener();

		NextQuoteListener.setQuotes(quotes);
		quoteClicked.setFrame(frame);
		nextQuoteButton.addActionListener(quoteClicked);
	}

	private void displayQuotesButtonActions(ArrayList<Quote> quotes, JFrame frame, JButton displayQuote) {

		DisplayQuotesListener click = new DisplayQuotesListener();

		click.setQuotes(quotes);
		click.setFrame(frame);
		displayQuote.addActionListener(click);
	}

}