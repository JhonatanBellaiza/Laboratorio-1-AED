package interfaceSort;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class RandomArrayWindow extends JFrame {
	
	
	private RandomReportWindow randomReportWindow;
	private PanelRandomOptions panelRandomOptions;
	
	
	
	
	public RandomArrayWindow() {
		this.setTitle("Random generate");
		this.setSize(450, 450);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		panelRandomOptions= new PanelRandomOptions(this);
		this.add(panelRandomOptions,BorderLayout.CENTER);
		
		
		
	}



	public void randomGenerate() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
