package Medication;

import java.util.Scanner;

import exception.AddFormatException;

public class Headache extends Medication{
		
	
		public Headache(MedicationKind kind) {
		super(kind);
    	
		}
	
	
	 public void getUserInput(Scanner input) {
	    	System.out.print("Medication Item Number : ");
			int ItemNumber = input.nextInt();
			this.setItemNumber(ItemNumber);
			
			System.out.print("Medication Name : ");
			String name = input.next();
			this.setName(name);
			
			
			System.out.print("Medication instruction: ");
			input.nextLine();
			String instruction = input.nextLine();
			this.setInstruction(instruction);
			setMedicationAdditionalinstructtionwithYN(input);
			
			System.out.print("Medication Price : ");
			int price = input.nextInt();
			this.setPrice(price);
			
			System.out.print("Medication Expiration date : ");
			int ExpirationDate = input.nextInt();
			this.setExpirationDate(ExpirationDate);
	 
	 }
	 public void printInfo() {
			String skind = getKindString();		
	    	System.out.println(" kind : " + skind + " ItemNumber : "+ ItemNumber + " name :"+ name + "instruction : " + instruction + " price : " + price + " ExpirationDate : " + ExpirationDate + " additionalinstruction : " + additionalinstruction );
	    }
	 
			public void setMedicationAdditionalinstructtionwithYN(Scanner input) {
			char answer = 'x';
			while (answer != 'y' && answer == 'Y' && answer == 'n' && answer == 'N') 
			{
				System.out.print("Do you have any additional instruction? (Y/N)");
				answer = input.next().charAt(0);
				try {
				if (answer == 'y' || answer == 'Y') {
					System.out.println("Medication Additional Instruction:");
					String additionalinstruction = input.nextLine();
					this.setAdditionalinstruction(additionalinstruction);
					break;
				} else if (answer == 'n' || answer == 'N') {
					this.setAdditionalinstruction("");
					break;
				} else {
				}
			 }
			catch(AddFormatException e) {
				System.out.println("Incorrect Additional Instruction Format. Put the Instruction that contains * ");
			}
			}
			
	    }
}

				
	 
