package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import java.awt.*;

public class DisplayQuotesListener implements ActionListener{
		
		private JButton displayQuotes;
		private static JPanel panel;
		private JFrame frame;
		private ArrayList<Quote> quotes;
	
		@Override
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == displayQuotes){
				JTextArea text = new JTextArea();
				for(Quote q : quotes){
				    text.append(q + System.getProperty("line.separator"));
				}
				displayAllQuotes(text);
				
			}
		}

		private void displayAllQuotes(JTextArea text) {
			panel = new JPanel();
			panel.add(text, BorderLayout.LINE_START);
			frame.setContentPane(panel);
			frame.pack();
			frame.setLocationByPlatform(true);
			panel.setVisible(true);
		}
		
		public void setFrame(JFrame frame) {
			this.frame = frame;
		}
		public JFrame getFrame() {
			return frame;
		}
		public void setDisplayQuoteButton(JButton displayQuotes) {
			this.displayQuotes = displayQuotes;
		}
		public void setQuotes(ArrayList<Quote> quotes) {
			this.quotes = quotes;
		}
		public static JPanel getPanel() {
			return panel;
		}
		
}
