package Medication;

import java.util.Scanner;

public class Cramps extends Medication { //implements 이유 : getuserinput 에 접근하기 위해서 userinput 가지고 medicationmanagemnet에서 사용가능해짐
    
	public Cramps(MedicationKind kind) {
		super(kind);
		}
	
	
	
	public void getUserInput(Scanner input) {
    	
		setMedicationItemNumber(input);
		setMedicationName(input);
		setMedicationInstruction(input);
		setMedicationPrice(input);
		setMedicationExpirationDate(input);
		setMedicationAdditionalinstruction(input);
    }
	


	public void printInfo() {
		String skind = getKindString();		
    	System.out.println(" kind : " + skind + " ItemNumber : "+ ItemNumber + " name :"+ name + "instruction : " + instruction + " price : " + price + " ExpirationDate : " + ExpirationDate + " additionalinstruction : " + additionalinstruction );
    }
}
