package app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AddQuoteListener implements ActionListener {
	
	private List<Quote> quotes;
	private JFrame frame;

	public void actionPerformed(ActionEvent e) {

		JTextField quote = new JTextField();
		JTextField authorFname = new JTextField();
		JTextField authorLname = new JTextField();

		Object[] message = { "Quote:", quote, "Author's first name:", authorFname, "Author's last name:", authorLname };
		addQuote(quote, authorFname, authorLname, message);
	}

	private void addQuote(JTextField quote, JTextField authorFname, JTextField authorLname, Object[] message) {
		JOptionPane.showConfirmDialog(frame, message, "New Quote", JOptionPane.OK_CANCEL_OPTION);
		String check = quote.getText() + authorFname.getText() + authorLname.getText();
		Quote newQuote = new Quote(quote.getText(), authorFname.getText(), authorLname.getText());
		if (!quotes.contains(newQuote) && !check.equals("")) {
			quotes.add(newQuote);
			JOptionPane.showMessageDialog(frame, "Quote added successfully");
		} else {
			JOptionPane.showMessageDialog(frame, "Your quote was unable to be added");
		}
	}

	public void setQuotes(List<Quote> quotes2) {
		this.quotes = quotes2;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
