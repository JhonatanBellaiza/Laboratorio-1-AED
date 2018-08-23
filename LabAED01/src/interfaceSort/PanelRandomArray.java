package interfaceSort;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class PanelRandomArray extends JPanel implements ActionListener{

	private MainWindow main;
	public static final String BUT_RANDOM_COMMAND ="random generate";
	
	private RandomArrayWindow randomArrayWindow;
	
	private JButton butRandomGenerate;
	private JCheckBox checkInverseOrdenated;
	private JRadioButton integerValue;
	private JRadioButton floatValue;
	
	
	public PanelRandomArray(MainWindow mainWindow) {
	main=mainWindow;
	this.setPreferredSize(new Dimension(125,0 ));
	this.setLayout(new BorderLayout());
	Border b= BorderFactory.createTitledBorder("Random Generate");
	this.setBorder(b);
	randomArrayWindow= new RandomArrayWindow();
	butRandomGenerate= new JButton("Random ");
	butRandomGenerate.setActionCommand(BUT_RANDOM_COMMAND);
	butRandomGenerate.addActionListener(this);
	this.add(butRandomGenerate,BorderLayout.CENTER);
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		String command= event.getActionCommand();
		if(command.equals(BUT_RANDOM_COMMAND)) {
			main.setVisible(false);
			randomArrayWindow.setVisible(true);
		}
		
	}


	public MainWindow getMain() {
		return main;
	}


	public void setMain(MainWindow main) {
		this.main = main;
	}


	
	

}
