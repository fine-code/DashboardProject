package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class DisplayQuotesListener implements ActionListener {

	private JButton displayQuotes;
	private JPanel panel;
	private JFrame frame;
	private ArrayList<Quote> quotes;

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextArea text = new JTextArea();
		for (Quote q : quotes) {
			text.append(q + System.getProperty("line.separator"));
		}
		displayAllQuotes(text);
	}

	private void displayAllQuotes(JTextArea text) {
		panel = new JPanel();
		panel.add(text, BorderLayout.LINE_START);
		frame.setContentPane(panel);
		frame.pack();
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void setDisplayQuoteButton(JButton displayQuotes) {
		this.displayQuotes = displayQuotes;
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}
}
