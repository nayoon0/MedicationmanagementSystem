package Medication;

import java.io.Serializable;
import java.util.Scanner;

import exception.AddFormatException;

public abstract class Medication implements MedicationInput, Serializable{  //abstract class 로 지정함 -> 더 이상 Medication 객체를 지정하지 않는다는 의미 
                                    /**
	 * 
	 */
	private static final long serialVersionUID = 5754077072782900162L;
	
	

	protected MedicationKind kind = MedicationKind.Cramps;
	protected int ItemNumber;
	protected String name;
	protected String instruction;
	protected int price;
	protected int ExpirationDate;
	protected String additionalinstruction;
    
   
	public Medication() {
    	
    }
	
	public Medication(MedicationKind kind) {
		this.kind = kind;
    	
    }
	
	
    public Medication(int ItemNumber, String name) {
    	this.ItemNumber = ItemNumber;
        this.name = name;
        
    }
    
    
    public Medication(MedicationKind kind, int ItemNumber, String name, String instruction, int price, int ExpirationDate, String additionalinstruction ) {
    	this.kind = kind;
    	this.ItemNumber = ItemNumber;
        this.name = name;
        this.instruction = instruction;
        this.price = price;
        this.ExpirationDate = ExpirationDate;
        this.additionalinstruction = additionalinstruction;
    }
    
    
	public MedicationKind getKind() {
		return kind;
	}
	public void setKind(MedicationKind kind) {
		this.kind = kind;
	}
	public int getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.ItemNumber = itemNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getExpirationDate() {
		return ExpirationDate;
	}
	public void setExpirationDate(int expirationDate) {
		ExpirationDate = expirationDate;
	}
	 public String getAdditionalinstruction() {
			return additionalinstruction;
		}
		public void setAdditionalinstruction(String additionalinstruction) throws AddFormatException{
			if (!additionalinstruction.contains("*")&& !additionalinstruction.equals("")) {
				throw new AddFormatException();
			}
			
			this.additionalinstruction = additionalinstruction;
		}


		
		public abstract void printInfo();
		
		public void setMedicationItemNumber(Scanner input) {
			System.out.print("Medication ItemNumber : ");
			int ItemNumber = input.nextInt();
			this.setItemNumber(ItemNumber);
		}
	
		public void setMedicationName(Scanner input) {
			System.out.print("Medication Name : ");
			String Name = input.next();
			this.setName(name);
		}
		
		public void setMedicationInstruction(Scanner input) {
			System.out.print("Medication Instruction: ");
			String Instruction = input.next();
			this.setInstruction(instruction);
		}
		
		public void setMedicationPrice(Scanner input) {
			System.out.print("Medication Price: ");
			int Price = input.nextInt();
			this.setPrice(price);
			
		}
		
		public void setMedicationExpirationDate(Scanner input) {
			System.out.print("Medication ExpirationDate: ");
			int ExpirationDate = input.nextInt();
			this.setExpirationDate(ExpirationDate);
		}
		
		public void setMedicationAdditionalinstruction(Scanner input) {
			String Additionalinstruction = "";
			while (!additionalinstruction.contains("*")) {
				System.out.print("Medication Additionalinstruction: ");
				Additionalinstruction = input.next();
				try {
					this.setAdditionalinstruction(additionalinstruction);
				} catch (AddFormatException e) {
					System.out.println("Incorrect Additional Instruction Format. Put the Instruction that contains * ");
				}
			}

		}
		
		public String getKindString() {
			String skind = "none";
			switch(this.kind) {
			case Cramps:
				skind = "Cramps.";
				break;
			case Stomachache : 
				skind = "Stomach";
				break;
			case Headache:
				skind = "Head";
				break;
			default :
			}
			return skind;
		}
}	

