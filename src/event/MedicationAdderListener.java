package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Medication.Cramps;
import Medication.MedicationInput;
import Medication.MedicationKind;
import manager.MedicationManager;

public class MedicationAdderListener implements ActionListener {
	

	JTextField fieldItemNumber;
	JTextField fieldName;
	JTextField fieldInstruction;
	JTextField fieldPrice;

	MedicationManager medicationManager;
	
	
	public MedicationAdderListener(
			JTextField fieldItemNumber,
			JTextField fieldName, 
			JTextField fieldInstruction,
			JTextField fieldPrice, MedicationManager medicationManager) {
		
		this.fieldItemNumber = fieldItemNumber;
		this.fieldName = fieldName;
		this.fieldInstruction = fieldInstruction;
		this.fieldPrice = fieldPrice;
		this.medicationManager = medicationManager;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		MedicationInput medication = new Cramps(MedicationKind.Cramps);
		medication.setItemNumber(Integer.parseInt(fieldItemNumber.getText()));
		medication.setName(fieldName.getText());
		medication.setInstruction(fieldInstruction.getText());
		medication.setPrice(Integer.parseInt(fieldPrice.getText()));
		medicationManager.addMedication(medication);
		putObject(medicationManager, "medicationmanager.ser");
		medication.printInfo();
		
		}
	
	
	
public static void putObject(MedicationManager medicationManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			
			out.writeObject(medicationManager);
			
			out.close();
			file.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

