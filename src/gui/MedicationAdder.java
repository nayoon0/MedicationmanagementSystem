package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MedicationAdder extends JPanel{
	
	WindowFrame frame;
	
	public MedicationAdder(WindowFrame frame) {
		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		
		JLabel labelItemNumber = new JLabel("Item Number : ", JLabel.TRAILING);
		JTextField fieldItemNumber = new JTextField(10);
		labelItemNumber.setLabelFor(fieldItemNumber);
		panel.add(labelItemNumber);
		panel.add(fieldItemNumber);
		
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		
		JLabel labelInstruction = new JLabel("Instruction : ", JLabel.TRAILING);
		JTextField fieldInstruction = new JTextField(10);
		labelName.setLabelFor(fieldInstruction);
		panel.add(labelInstruction);
		panel.add(fieldInstruction);
		
		
		JLabel labelPrice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelName.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 2, 6, 6, 6);
		
		
		
		this.add(panel);
		this.setVisible(true);
		
		
		
	}

}
