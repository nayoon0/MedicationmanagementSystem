package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Medication.MedicationInput;
import manager.MedicationManager;

public class MedicationViewer extends JPanel{
	
	WindowFrame frame;
	
	MedicationManager medicationManager;

	public MedicationViewer(WindowFrame frame, MedicationManager medicationManager) {
		
		this.frame = frame;
		this.medicationManager = medicationManager;
		
		System.out.println("***" + medicationManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Item Number");
		model.addColumn("Name");
		model.addColumn("Instruction");
		model.addColumn("Contact Info.");
		
		for ( int i=0; i< medicationManager.size(); i++) {
			Vector row = new Vector();
			MedicationInput mi = medicationManager.get(i);
			row.add(mi.getItemNumber());
			row.add(mi.getName());
			row.add(mi.getInstruction());
			row.add(mi.getPrice());
			model.addRow(row);
		}
		
		
		JTable tabel = new JTable(model);
		JScrollPane sp = new JScrollPane(tabel);
		
		this.add(sp);
		
		
	}

}
