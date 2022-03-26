import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
	    
		while (num != 6) {
			System.out.println("*** Medications Management System Menu ***");
			System.out.println("1. Add Medications");
			System.out.println("2. Delete Medications");
			System.out.println("3. Edit Medications");
			System.out.println("4. View Medications");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6 : ");
			num = input.nextInt();
			if (num == 1) {
				addMedication();
			}
			else if (num == 2) {
				deleteMedication();
			}
			else if (num == 3) {
				editMedication();
			}
			else if (num == 4) {
				viewMedication();
			}
			else {
				continue;
			}
		}	
	}
		public static void addMedication() {
			Scanner input = new Scanner(System.in);
			System.out.print("Medication Item Number : ");
			int medicationIN = input.nextInt();
			System.out.print("Medication Name : ");
			String medicationName = input.next();
			System.out.print("Medication Use: ");
			String medicationUse = input.next();
			System.out.print("Medication Price : ");
			int medicationPrice = input.nextInt();
			
	   }
		public static void deleteMedication() {
			Scanner input = new Scanner(System.in);
			System.out.print("Medication Item Number : ");
			int medicationIN = input.nextInt();
			System.out.print("Medication Delete Reason : ");
			String medicationDeleteReason = input.next();
			
		}


		public static void editMedication() {
			Scanner input = new Scanner(System.in);
			System.out.print("Medication Item Number : ");
			int medicationIN = input.nextInt();
		
		
		}		
		
		public static void viewMedication() {
			Scanner input = new Scanner(System.in);
			System.out.print("Medication Item Number : ");
			int medicationIN = input.nextInt();
			
		
		}
		
}