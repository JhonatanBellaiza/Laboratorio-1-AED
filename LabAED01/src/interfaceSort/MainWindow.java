package interfaceSort;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Procesator;

public class MainWindow extends JFrame {
	
	private Procesator pr;
	private PanelRandomArray panelRandomArray;
	private PanelManualArray panelManualArray;
	
	public MainWindow () {
		this.setSize(250, 250);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("AED Lab 01 ");
		pr= new Procesator();
		panelRandomArray = new PanelRandomArray(this);
		panelManualArray = new PanelManualArray(this);
		this.add(BorderLayout.WEST,panelRandomArray);
		this.add(BorderLayout.EAST,panelManualArray);
		
		
		
	}
	
	
	public static void main(String[]a) {
		MainWindow main= new MainWindow();
		main.setVisible(true);
		
		
	}


	public PanelRandomArray getPanelRandomArray() {
		return panelRandomArray;
	}


	public void setPanelRandomArray(PanelRandomArray panelRandomArray) {
		this.panelRandomArray = panelRandomArray;
	}


	public PanelManualArray getPanelManualArray() {
		return panelManualArray;
	}


	public void setPanelManualArray(PanelManualArray panelManualArray) {
		this.panelManualArray = panelManualArray;
	}
	
	
	

}
