package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DislikeListener implements ActionListener {

	private Controller ctrl;
	
	public DislikeListener(Controller c) {
		this.ctrl = c;
	}

	public void actionPerformed(ActionEvent e) {

		if(ctrl.getQuotes().size() == 1) {
			ctrl.getQuotes().remove(0);
		}else if(ctrl.getQuoteIndex() == 0 && ctrl.getQuotes().size() !=0) {
			ctrl.getQuotes().remove(ctrl.getQuotes().size() - 1);
		}else if(ctrl.getQuotes().size() != 0){
			ctrl.getQuotes().remove(ctrl.getQuoteIndex() - 1);
			NextQuoteListener.setquoteIndex(ctrl.getQuoteIndex() - 1);
		}
	}

}