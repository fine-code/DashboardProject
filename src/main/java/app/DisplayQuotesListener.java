package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class DisplayQuotesListener implements ActionListener {

	private JPanel panel;
	private JFrame frame;
	private Controller ctrl;
	
	public DisplayQuotesListener(Controller c) {
		this.ctrl = c;
	}

	public void actionPerformed(ActionEvent e) {
		JTextArea text = new JTextArea();
		for (Quote q : ctrl.getQuotes()) {
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

}
