package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AddQuoteListener implements ActionListener {
	private JButton addQuote;
	private ArrayList<Quote> quotes;
	private JFrame frame;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addQuote) {

			String quote = "";
			String authorFname = "";
			String authorLname = "";

			while (quote.isEmpty()) {
				quote = JOptionPane.showInputDialog(frame, "Enter quote");
			}
			while (authorFname.isBlank()) {
				authorFname = JOptionPane.showInputDialog(frame, "Enter author's first name");
			}
			while (authorLname.isBlank()) {
				authorLname = JOptionPane.showInputDialog(frame, "Enter author's last name");
			}
			addQuote(quote, authorFname, authorLname);
		}
	}

	private void addQuote(String quote, String authorFname, String authorLname) {
		Person author = new Person(authorFname, authorLname);
		Quote newQuote = new Quote(quote, author);
		quotes.add(newQuote);
	}

	public void setAddQuote(JButton addQuote) {
		this.addQuote = addQuote;
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
