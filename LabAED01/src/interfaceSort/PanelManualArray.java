package interfaceSort;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelManualArray extends JPanel implements ActionListener{
	public static final String BUT_MANUAL_COMMAND = "manual generate";
	private MainWindow main;
	private JButton butManualGenerate;
	private ManualArrayWindow manualArrayWindow;
	
	public PanelManualArray(MainWindow mainWindow) {
		main=mainWindow;
		this.setPreferredSize(new Dimension(125,0));
		this.setLayout(new BorderLayout());
		Border b= BorderFactory.createTitledBorder("Manual Generate");
		this.setBorder(b);
		manualArrayWindow= new ManualArrayWindow();
		butManualGenerate=new JButton("Manual ");
		butManualGenerate.addActionListener(this);
		butManualGenerate.setActionCommand(this.BUT_MANUAL_COMMAND);
		this.add(butManualGenerate,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando= evento.getActionCommand();
		if(comando.equals(BUT_MANUAL_COMMAND)) {
			main.setVisible(false);
			manualArrayWindow.setVisible(true);
		}
	}

	public MainWindow getMain() {
		return main;
	}

	public void setMain(MainWindow main) {
		this.main = main;
	}

	public JButton getButManualGenerate() {
		return butManualGenerate;
	}

	public void setButManualGenerate(JButton butManualGenerate) {
		this.butManualGenerate = butManualGenerate;
	}

	public ManualArrayWindow getManualArrayWindow() {
		return manualArrayWindow;
	}

	public void setManualArrayWindow(ManualArrayWindow manualArrayWindow) {
		this.manualArrayWindow = manualArrayWindow;
	}

}
