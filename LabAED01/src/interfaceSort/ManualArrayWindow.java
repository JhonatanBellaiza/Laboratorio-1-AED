package interfaceSort;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ManualArrayWindow extends JFrame {
	
	private ManualReportWindow manualReportWindow;
	private PanelManualOptions panelManualOptions;
	
	
	
	
	public ManualArrayWindow() {
		this.setTitle("Manual generate");
		this.setSize(450, 450);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		panelManualOptions= new PanelManualOptions(this);
		this.add(panelManualOptions,BorderLayout.CENTER);
		
		
		
	}



	public void manualGenerate() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
