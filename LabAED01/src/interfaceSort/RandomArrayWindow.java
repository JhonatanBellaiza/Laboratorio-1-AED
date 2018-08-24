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



	public void randomGenerate(String type, String repeat, int amount, int upperBound, int lowerBound, String order, int percent) {
	
		
		
		main.randomGenerate(type, repeat, Integer.parseInt(jTxtQuantity.getText()), Integer.parseInt(jTxtUpperBound.getText()), Integer.parseInt(jTxtLowerBound.getText()), ordenated,Integer.parseInt(jTxtPercentOrder.getText()));
	}
	
	public void randomGenerate(String type, String repeat, int amount, int upperBound, int lowerBound, String order) {
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
