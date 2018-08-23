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

public class PanelManualOptions extends JPanel implements ActionListener{

	public final static String BUTTON_PERCENT_ORDER = "percent order";
	public final static String BUTTON_INVERSE_VALUES = "inverse values";
	public final static String BUTTON_RANDOM_ORDER = "random values";
	public final static String BUTTON_ORDENATE_VALUES = "ordenate values";
	public final static String BUTTON_GENERATE = "generate";
	
	
	private	ManualArrayWindow main;
	private JButton butGenerate;
	private PanelManualList panelManualList;
	private JRadioButton radIntegerValue;
	private JRadioButton radFloatValue;
	private JRadioButton radOrdenatedValues;
	private JRadioButton radInverseOrdenatedValues;
	private JRadioButton radRandomOrder;
	private JRadioButton radPercentOrder;
	private JTextField jTxtPercentOrder;
	private ButtonGroup buttonGroupType;
	private ButtonGroup buttonGroupOrdenated;

	
	
	
	
	public PanelManualOptions(ManualArrayWindow p) {
		main=p;
		this.setPreferredSize(new Dimension(450,0));
		this.setLayout(new BorderLayout());
		panelManualList= new PanelManualList();
		
		JPanel auxPanel2=new JPanel();
		auxPanel2.setLayout(new GridLayout(1,2));
		JPanel auxPanel3=new JPanel();
		auxPanel3.setLayout(new GridLayout(4,3));
		this.add(panelManualList, BorderLayout.CENTER);
		
		buttonGroupType= new ButtonGroup();
		radIntegerValue= new JRadioButton("Int");
		radFloatValue= new JRadioButton("Float");
		buttonGroupType.add(radIntegerValue);
		buttonGroupType.add(radFloatValue);
		
		auxPanel2.add(radIntegerValue);
		auxPanel2.add(radFloatValue);
		Border b2= BorderFactory.createTitledBorder("Type");
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
			if(buttonGroupType.getSelection()==null) {
				JOptionPane.showMessageDialog(this,"Please Select the type of data to generate","Message",JOptionPane.ERROR_MESSAGE);
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
				main.manualGenerate();
			}
			
		}
		
	}


	


}
