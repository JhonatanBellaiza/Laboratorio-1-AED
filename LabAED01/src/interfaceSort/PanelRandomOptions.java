package interfaceSort;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelRandomOptions extends JPanel implements ActionListener{
	
	public final static String BUTTON_PERCENT_ORDER = "percent order";
	public final static String BUTTON_INVERSE_VALUES = "inverse values";
	public final static String BUTTON_RANDOM_ORDER = "random values";
	public final static String BUTTON_ORDENATE_VALUES = "ordenate values";
	public final static String BUTTON_GENERATE = "generate";
	
	
	private RandomArrayWindow main;
	private JButton butGenerate;
	private JLabel labQuantity;
	private JTextField jTxtQuantity;
	private JLabel labUpperBound;
	private JTextField jTxtUpperBound;
	private JLabel labLowerBound;
	private JTextField jTxtLowerBound;
	private JRadioButton radIntegerValue;
	private JRadioButton radFloatValue;
	private JRadioButton radRepeatValues;
	private JRadioButton radAllDifferentValues;
	private JRadioButton radOrdenatedValues;
	private JRadioButton radInverseOrdenatedValues;
	private JRadioButton radRandomOrder;
	private JRadioButton radPercentOrder;
	private JTextField jTxtPercentOrder;
	private ButtonGroup buttonGroupType;
	private ButtonGroup buttonGroupOrdenated;
	private ButtonGroup buttonGroupRepeat;
	
	
	
	
	public PanelRandomOptions(RandomArrayWindow p) {
		main=p;
		this.setPreferredSize(new Dimension(450,0));
		this.setLayout(new BorderLayout());
		JPanel auxPanel1 = new JPanel();
		auxPanel1.setLayout(new GridLayout(7,4));
		JPanel auxPanel2=new JPanel();
		auxPanel2.setLayout(new GridLayout(2,2));
		JPanel auxPanel3=new JPanel();
		auxPanel3.setLayout(new GridLayout(4,3));
		labQuantity= new JLabel("Amount to gte");
		jTxtQuantity=new JTextField();
		labUpperBound= new JLabel("Upper Bound");
		jTxtUpperBound=new JTextField();
		labLowerBound= new JLabel("Lower Bound");
		jTxtLowerBound=new JTextField();
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(labQuantity);
		auxPanel1.add(new JLabel());
		auxPanel1.add(jTxtQuantity);
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(labUpperBound);
		auxPanel1.add(new JLabel());
		auxPanel1.add(jTxtUpperBound);
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(labLowerBound);
		auxPanel1.add(new JLabel());
		auxPanel1.add(jTxtLowerBound);
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		auxPanel1.add(new JLabel());
		Border b1= BorderFactory.createTitledBorder("Amount");
		auxPanel1.setBorder(b1);
		this.add(auxPanel1,BorderLayout.CENTER);
		
		buttonGroupType= new ButtonGroup();
		radIntegerValue= new JRadioButton("Int");
		radFloatValue= new JRadioButton("Float");
		buttonGroupType.add(radIntegerValue);
		buttonGroupType.add(radFloatValue);
		
		buttonGroupRepeat= new ButtonGroup();
		radRepeatValues= new JRadioButton("Repeat Values");
		radAllDifferentValues= new JRadioButton("All Different");
		buttonGroupRepeat.add(radRepeatValues);
		buttonGroupRepeat.add(radAllDifferentValues);
		
		auxPanel2.add(radIntegerValue);
		auxPanel2.add(radRepeatValues);
		auxPanel2.add(radFloatValue);
		auxPanel2.add(radAllDifferentValues);
		Border b2= BorderFactory.createTitledBorder("Type and Repeats");
		auxPanel2.setBorder(b2);
		this.add(auxPanel2, BorderLayout.NORTH);
		
		buttonGroupOrdenated = new ButtonGroup();
		
		radOrdenatedValues= new JRadioButton("Ordenated Values");
		radOrdenatedValues.addActionListener(this);
		radOrdenatedValues.setActionCommand(this.BUTTON_ORDENATE_VALUES);
		radInverseOrdenatedValues= new JRadioButton("Reverse Order");
		radInverseOrdenatedValues.addActionListener(this);
		radInverseOrdenatedValues.setActionCommand(this.BUTTON_INVERSE_VALUES);
		radRandomOrder = new JRadioButton("Random Order");
		radRandomOrder.addActionListener(this);
		radRandomOrder.setActionCommand(this.BUTTON_RANDOM_ORDER);
		radPercentOrder= new JRadioButton("Percent Order");
		radPercentOrder.addActionListener(this);
		radPercentOrder.setActionCommand(this.BUTTON_PERCENT_ORDER);
		jTxtPercentOrder = new JTextField();
		jTxtPercentOrder.setEnabled(false);
		buttonGroupOrdenated.add(radOrdenatedValues);
		buttonGroupOrdenated.add(radInverseOrdenatedValues);
		buttonGroupOrdenated.add(radRandomOrder);
		buttonGroupOrdenated.add(radPercentOrder);
		
		Border b3= BorderFactory.createTitledBorder("Order");
		auxPanel3.setBorder(b3);
		auxPanel3.add(radOrdenatedValues);
		auxPanel3.add(new JLabel());
		auxPanel3.add(new JLabel());
		auxPanel3.add(radInverseOrdenatedValues);
		auxPanel3.add(new JLabel());
		auxPanel3.add(new JLabel());
		auxPanel3.add(radRandomOrder);
		auxPanel3.add(new JLabel());
		auxPanel3.add(new JLabel());
		auxPanel3.add(radPercentOrder);
		auxPanel3.add(jTxtPercentOrder);
		butGenerate= new JButton("Generate");
		butGenerate.addActionListener(this);
		butGenerate.setActionCommand(BUTTON_GENERATE);
		auxPanel3.add(butGenerate);

		this.add(auxPanel3, BorderLayout.SOUTH);

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		String command= event.getActionCommand();
		if(command.equals(BUTTON_PERCENT_ORDER)) {
			jTxtPercentOrder.setEnabled(true);
		}
		else if(command.equals(BUTTON_INVERSE_VALUES)) {
			if(jTxtPercentOrder.isEnabled()) {
				jTxtPercentOrder.setText("");
				jTxtPercentOrder.setEnabled(false);
			}
				
	
		}
		else if(command.equals(BUTTON_ORDENATE_VALUES)){
			if(jTxtPercentOrder.isEnabled()) {
				jTxtPercentOrder.setText("");
				jTxtPercentOrder.setEnabled(false);
			}
		}
		else if(command.equals(BUTTON_RANDOM_ORDER)) {
			if(jTxtPercentOrder.isEnabled()) {
				jTxtPercentOrder.setText("");
				jTxtPercentOrder.setEnabled(false);
			}
		}
		else if(command.equals(BUTTON_GENERATE)) {
			if(buttonGroupType.getSelection()==null||buttonGroupRepeat.getSelection()==null) {
				JOptionPane.showMessageDialog(this,"Please Select the type of data to generate, and if is repeat or not","Message",JOptionPane.ERROR_MESSAGE);
			}
			else if(jTxtQuantity.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"Please enter the number of numbers to generate" , "Message", JOptionPane.ERROR_MESSAGE);
			}
			else if(jTxtUpperBound.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"Please enter the Upper Bound of numbers to generate" , "Message", JOptionPane.ERROR_MESSAGE);
			}
			else if(jTxtLowerBound.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"Please enter the Lower Bound of numbers to generate" , "Message", JOptionPane.ERROR_MESSAGE);
			}
			else if(buttonGroupOrdenated.getSelection()==null) {
				JOptionPane.showMessageDialog(this,"Please select and option to ordenate the values" , "Message", JOptionPane.ERROR_MESSAGE);
			}
			else if(jTxtPercentOrder.isEnabled()&&jTxtPercentOrder.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"Please enter the Percent value to order" , "Message", JOptionPane.ERROR_MESSAGE);
			}
			else if(jTxtPercentOrder.isEnabled()) {
				 try {
			           int value=Integer.parseInt(jTxtPercentOrder.getText());
			           if(value<0||value>100) {
			        	   JOptionPane.showMessageDialog(this,"Please enter only whole numbers from 0 to 100" , "Message", JOptionPane.ERROR_MESSAGE);
			           }
			           
			        } catch (NumberFormatException excepcion) {
			        	JOptionPane.showMessageDialog(this,"Please enter only WHOLE NUMBERS in the percent order box" , "Message", JOptionPane.ERROR_MESSAGE);
			        }
			}
			else {
				main.randomGenerate();
			}
			
		}
		
	}





	public RandomArrayWindow getMain() {
		return main;
	}





	public void setMain(RandomArrayWindow main) {
		this.main = main;
	}





	public JLabel getLabQuantity() {
		return labQuantity;
	}





	public void setLabQuantity(JLabel labQuantity) {
		this.labQuantity = labQuantity;
	}





	public JTextField getjTxtQuantity() {
		return jTxtQuantity;
	}





	public void setjTxtQuantity(JTextField jTxtQuantity) {
		this.jTxtQuantity = jTxtQuantity;
	}





	public JLabel getLabUpperBound() {
		return labUpperBound;
	}





	public void setLabUpperBound(JLabel labUpperBound) {
		this.labUpperBound = labUpperBound;
	}





	public JTextField getjTxtUpperBound() {
		return jTxtUpperBound;
	}





	public void setjTxtUpperBound(JTextField jTxtUpperBound) {
		this.jTxtUpperBound = jTxtUpperBound;
	}





	public JLabel getLabLowerBound() {
		return labLowerBound;
	}





	public void setLabLowerBound(JLabel labLowerBound) {
		this.labLowerBound = labLowerBound;
	}





	public JTextField getjTxtlowerBound() {
		return jTxtLowerBound;
	}





	public void setjTxtlowerBound(JTextField jTxtlowerBound) {
		this.jTxtLowerBound = jTxtlowerBound;
	}





	public JRadioButton getRadIntegerValue() {
		return radIntegerValue;
	}





	public void setRadIntegerValue(JRadioButton radIntegerValue) {
		this.radIntegerValue = radIntegerValue;
	}





	public JRadioButton getRadFloatValue() {
		return radFloatValue;
	}





	public void setRadFloatValue(JRadioButton radFloatValue) {
		this.radFloatValue = radFloatValue;
	}





	public JRadioButton getRadRepeatValues() {
		return radRepeatValues;
	}





	public void setRadRepeatValues(JRadioButton radRepeatValues) {
		this.radRepeatValues = radRepeatValues;
	}





	public JRadioButton getRadAllDifferentValues() {
		return radAllDifferentValues;
	}





	public void setRadAllDifferentValues(JRadioButton radAllDifferentValues) {
		this.radAllDifferentValues = radAllDifferentValues;
	}





	public JRadioButton getRadOrdenatedValues() {
		return radOrdenatedValues;
	}





	public void setRadOrdenatedValues(JRadioButton radOrdenatedValues) {
		this.radOrdenatedValues = radOrdenatedValues;
	}





	public JRadioButton getRadInverseOrdenatedValues() {
		return radInverseOrdenatedValues;
	}





	public void setRadInverseOrdenatedValues(JRadioButton radInverseOrdenatedValues) {
		this.radInverseOrdenatedValues = radInverseOrdenatedValues;
	}





	public JRadioButton getRadRandomOrder() {
		return radRandomOrder;
	}





	public void setRadRandomOrder(JRadioButton radRandomOrder) {
		this.radRandomOrder = radRandomOrder;
	}





	public JRadioButton getRadPercentOrder() {
		return radPercentOrder;
	}





	public void setRadPercentOrder(JRadioButton radPercentOrder) {
		this.radPercentOrder = radPercentOrder;
	}





	public JTextField getjTxtPercentOrder() {
		return jTxtPercentOrder;
	}





	public void setjTxtPercentOrder(JTextField jTxtPercentOrder) {
		this.jTxtPercentOrder = jTxtPercentOrder;
	}







}
