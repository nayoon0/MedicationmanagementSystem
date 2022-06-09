package Medication;

import java.util.Scanner;

import exception.AddFormatException;

public interface MedicationInput {
	
	
	
	public int getItemNumber();
	
	public void setItemNumber(int itemNumber);
	
	public void setName(String name);
	
	public String getName();
	
	public void setInstruction(String instruction);
	
	public String getInstruction();
	
	public void setPrice(int price);
	
	public int getPrice();
	
	public void setExpirationDate(int expiration);
	
	public void setAdditionalinstruction(String additionalinstruction) throws AddFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMedicationItemNumber(Scanner input);
	
	public void setMedicationName(Scanner input);
	
	public void setMedicationInstruction(Scanner input);
	
	public void setMedicationPrice(Scanner input);
	
	public void setMedicationExpirationDate(Scanner input);
	
	public void setMedicationAdditionalinstruction(Scanner input);
	
	
}
