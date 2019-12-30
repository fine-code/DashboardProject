package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AddQuoteListener implements ActionListener {
	private JButton addQuote;
	private ArrayList<Quote> quotes;
	private JFrame frame;

	@Override
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
		Person author = new Person(authorFname.getText(), authorLname.getText());
		Quote newQuote = new Quote(quote.getText(), author);
		if (!quotes.contains(newQuote) && !check.equals("")) {
			quotes.add(newQuote);
			JOptionPane.showMessageDialog(frame, "Quote added successfully");
		} else {
			JOptionPane.showMessageDialog(frame, "Your quote was unable to be added");
		}
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
