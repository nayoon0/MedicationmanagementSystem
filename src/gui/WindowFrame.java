package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MedicationManager;

public class WindowFrame extends JFrame{
	
	MedicationManager medicationManager;
	
	MenuSelection menuSelection;
	MedicationAdder medicationadder;
	MedicationViewer medicationviewer;

	public WindowFrame(MedicationManager medicationManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Menu Selection 에 있던 부분 가져옴
		this.setTitle("My frame");
		
		
		this.medicationManager = medicationManager;
		menuSelection = new MenuSelection(this);
		medicationadder = new MedicationAdder(this);
		medicationviewer = new MedicationViewer(this, this.medicationManager);
	
		
		
		this.add(menuSelection);
		//this.add(medicationadder);
		//this.add(medicationviewer);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
		
	}
	
	public MenuSelection getMenuselection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuSelection = menuselection;
	}

	public MedicationAdder getMedicationadder() {
		return medicationadder;
	}

	public void setMedicationadder(MedicationAdder medicationadder) {
		this.medicationadder = medicationadder;
	}

	public MedicationViewer getMedicationviewer() {
		return medicationviewer;
	}

	public void setMedicationviewer(MedicationViewer medicationviewer) {
		this.medicationviewer = medicationviewer;
	}

	
	
}
