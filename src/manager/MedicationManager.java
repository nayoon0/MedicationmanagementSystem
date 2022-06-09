package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Medication.Cramps;
import Medication.Headache;
import Medication.Medication;
import Medication.MedicationInput;
import Medication.MedicationKind;
import Medication.Stomachache;
import exception.AddFormatException;

public class MedicationManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6665614167593104804L;
	
	ArrayList<MedicationInput> medications = new ArrayList<MedicationInput>();
	transient Scanner input;

	MedicationManager(Scanner input) {
		this.input = input; // input을 모든 method에서 사용가능
	}
     
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	
	
	
	public void addMedication() {
		int kind = 0;
		MedicationInput medicationInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Cramps");
				System.out.println("2 for Stomachache");
				System.out.println("3 for Headache");
				System.out.println("Select num for Medication Use one of 1,2,3 : ");
				kind = input.nextInt();
				if (kind == 1) {
					medicationInput = new Cramps(MedicationKind.Cramps);
					medicationInput.getUserInput(input);
					medications.add(medicationInput);
					break;
				} else if (kind == 2) {
					medicationInput = new Stomachache(MedicationKind.Stomachache);
					medicationInput.getUserInput(input);
					medications.add(medicationInput);
					break;
				} else if (kind == 3) {
					medicationInput = new Headache(MedicationKind.Headache);
					medicationInput.getUserInput(input);
					medications.add(medicationInput);
					break;
				}

				else {
					System.out.print("Select num for Medication Use one of 1,2,3 : ");
				}
			} catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;

			}
		}
	}

	public void deleteMedication() {
		System.out.print("Medication Item Number : ");
		int medicationItemNumber = input.nextInt();
		int index = findIndex(medicationItemNumber);
		removefromMedications(index, medicationItemNumber);
	}
	
	public int findIndex(int medicationItemNumber) {
		int index = -1;
		for (int i = 0; i<medications.size(); i++) {
			if (medications.get(i).getItemNumber() == medicationItemNumber) {
				index = i;
				break;
			}
		}
	
		return index;
	}
	
		public int removefromMedications(int index,int medicationItemNumber) {
			if(index >= 0) {
				medications.remove(index);
				System.out.println("the medication" + medicationItemNumber + "is deleted");
				return 1;
			}
			else {
				System.out.println("the medication has not been registered");
				return -1;
			}
		}



	public void editMedication() throws AddFormatException {
		System.out.print("Medication Item Number : ");
		int medicationIN = input.nextInt();
		for (int i = 0; i < medications.size(); i++) {
			MedicationInput medicationInput = medications.get(i); // interface써서 가져오기로 했기 때문에 각각 MedicationInput 으로 변경
			if (medicationInput.getItemNumber() == medicationIN) { // 여기도 medicationInput으로 변경
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						medication.setMedicationItemNumber(input);
						break;
					case 2:
						medication.setmedicationName(input);
						break;
					case 3:
						medication.setmedicationInstruction(input);
						break;
					case 4:
						medication.setmedicationPrice(input);
						break;
					default:
					   continue;
					}
				}//while
				break;
			}//if
		}//for
	}


	public void viewMedications() {
//		System.out.print("Medication Item Number : ");
//		int medicationIN = input.nextInt();
		System.out.println("# of registered medications : " + medications.size());
		for (int i = 0; i < medications.size(); i++) {
			medications.get(i).printInfo();

		}

	}
	
	public int size() {
		return medications.size();
	}
	
	public MedicationInput get(int index) {
		return (Medication) medications.get(index);
	}
	
	
	
	
	public void showEditMenu() {
		System.out.println("** Medication Info Edit Menu");
		System.out.println(" 1. Edit ItemNumber");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Instruction");
		System.out.println(" 4. Edit Price");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5 : ");
	}
	
	
	
}
