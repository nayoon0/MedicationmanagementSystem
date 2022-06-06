package Medication;

import java.util.Scanner;

import exception.AddFormatException;

public class Stomachache extends Medication implements MedicationInput{
	
		public Stomachache(MedicationKind kind) {
		super(kind);
    	
		}
	
		protected String parentinstruction;
		protected String parentadditionalinstruction;
	
		public void getUserInput(Scanner input) {
	    	System.out.print("Medication Item Number : ");
			int ItemNumber = input.nextInt();
			this.setItemNumber(ItemNumber);
			
			System.out.print("Medication Name : ");
			input.nextLine();    //숫자뒤에 글 적을 경우에 사용법! 넣어주면 붙어 나오는 것을 막을 수 있음!
			String name = input.nextLine();
			this.setName(name);
			
			
			System.out.print("Medication instruction: ");
			String instruction = input.nextLine();
			this.setInstruction(instruction);
			setWarningwithYN(input);
			
			System.out.print("Medication Price : ");
			int price = input.nextInt();
			this.setPrice(price);
			
			System.out.print("Medication Expiration date : ");
			input.nextLine();
			int ExpirationDate = input.nextInt();
			this.setExpirationDate(ExpirationDate);
		}
		 
		public void setWarningwithYN(Scanner input) {
			char answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
			{
			System.out.print("Do you have any additional instruction? (Y/N)");
			answer = input.nextLine().charAt(0);
			try {
			if(answer == 'y' || answer == 'Y') {
				System.out.println("Medication Additional Instruction:");
				String additionalinstruction = input.nextLine();
				this.setAdditionalinstruction(additionalinstruction);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setAdditionalinstruction("");
				break;
			}
			else {
			}
			 }
			catch(AddFormatException e) {
				System.out.println("Incorrect Additional Instruction Format. Put the Instruction that contains * ");
			}
		}
					
		
		}	

		public void printInfo() {
			String skind = getKindString();		
	    	System.out.println("kind : " + skind + " name :"+ name + " ItemNumber : "+ ItemNumber + " instruction : " + instruction + " price : " + price + " ExpirationDate : " + ExpirationDate + " (Warning)additionalinstruction : " + additionalinstruction );
	    }
		

}
