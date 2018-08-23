package interfaceSort;

import java.awt.BorderLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class PanelManualList extends JPanel implements ActionListener {
	
	public final static String BUT_ADD = "add";
	
	

	private DefaultListModel defaultListModel;
	private JList theList;
	private JScrollPane theScroll;
	private JButton butAdd;
	
	
	public PanelManualList() {
		Border b= BorderFactory.createTitledBorder("Amount");
		this.setBorder(b);
		this.setLayout(new BorderLayout());
		defaultListModel=new DefaultListModel();
		theList= new JList(defaultListModel);
		theScroll= new JScrollPane(theList);
		butAdd= new JButton("Add");
		butAdd.addActionListener(this);
		butAdd.setActionCommand(this.BUT_ADD);


		this.add(theScroll,BorderLayout.CENTER);
		this.add(butAdd,BorderLayout.EAST);
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if(command.equals(BUT_ADD)) {
			String fact= JOptionPane.showInputDialog(this, "Please Insert the value", "Insert the Number",JOptionPane.DEFAULT_OPTION);
			addToList(fact);
		}
		
		
	}
	
	public void addToList(String value) {
		defaultListModel.addElement(value);


	}
	
	
	
	
	
	
	
}
