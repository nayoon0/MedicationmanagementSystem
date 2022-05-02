import java.util.Scanner;

public class MenuManager { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MedicationManager medicationManager = new MedicationManager(input);
		int num = -1;
		
		while (num != 5) {
			System.out.println("*** Medications Management System Menu ***");
			System.out.println("1. Add Medication");
			System.out.println("2. Delete Medication");
			System.out.println("3. Edit Medication");
			System.out.println("4. View Medications");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-6 : ");
			num = input.nextInt();
			if (num == 1) {
				medicationManager.addMedication();
			}
			else if (num == 2) {
				medicationManager.deleteMedication();
			}
			else if (num == 3) {
				medicationManager.editMedication();
			}
			else if (num == 4) {
				medicationManager.viewMedications();
			}
			else {
				continue;
			}
		}	
	}
		
}