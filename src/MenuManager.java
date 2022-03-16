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
			switch(num) {
			case 1 : 
				System.out.print("Medication use");
				String medicationuse = input.next();
				System.out.print("Medication name");
				String medicationname = input.next();
				System.out.print("Medication price");
				int medicationprice = input.nextInt();
				break;
			case 2 :
			case 3 :
			case 4 :
				System.out.print("Medication name");
				String medicationname2 = input.next();
			}
			
			}
	   }
	}
