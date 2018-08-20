package interfaceSort;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelRandomArray extends JPanel{

	private MainWindow principal;
	
	private JButton butRandomGenerate;
	private JCheckBox checkInverseOrdenated;
	private JRadioButton integerValue;
	private JRadioButton floatValue;
	
	
	public PanelRandomArray(MainWindow mainWindow) {
		principal=mainWindow;
		this.setPreferredSize(new Dimension( ));
	}

}
