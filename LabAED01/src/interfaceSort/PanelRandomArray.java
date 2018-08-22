package interfaceSort;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class PanelRandomArray extends JPanel implements ActionListener{

	private MainWindow principal;
	
	private JButton butRandomGenerate;
	private JCheckBox checkInverseOrdenated;
	private JRadioButton integerValue;
	private JRadioButton floatValue;
	
	
	public PanelRandomArray(MainWindow mainWindow) {
	principal=mainWindow;
	this.setPreferredSize(new Dimension(125,0 ));
	this.setLayout(new BorderLayout());
	Border b= BorderFactory.createTitledBorder("Random Generate");
	this.setBorder(b);
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		
		
	}
	
	

}
