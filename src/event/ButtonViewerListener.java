package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import gui.MedicationViewer;
import gui.WindowFrame;
import manager.MedicationManager;

public class ButtonViewerListener implements ActionListener{
	
	WindowFrame frame;

	public ButtonViewerListener(WindowFrame frame) {
		this.frame = frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MedicationManager medicationManager = getObject("medicationmanager.ser");
		MedicationViewer medicationViewer = frame.getMedicationviewer();
		medicationViewer.setMedicationManager(medicationManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(medicationViewer);
		frame.revalidate();
		frame.repaint();
		
	}
	public static MedicationManager getObject(String filename) {
		MedicationManager medicationManager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			
			medicationManager = (MedicationManager) in.readObject();
			
			in.close();
			file.close();

			
		} catch (FileNotFoundException e) {
			return medicationManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return medicationManager;
	}

}
