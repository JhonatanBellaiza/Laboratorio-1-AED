package interfaceSort;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelManualArray extends JPanel{

	private MainWindow principal;
	
	public PanelManualArray(MainWindow mainWindow) {
		principal=mainWindow;
		this.setPreferredSize(new Dimension(125,0));
		this.setLayout(new BorderLayout());
		Border b= BorderFactory.createTitledBorder("Manual Generate");
		this.setBorder(b);
		
	}

}
