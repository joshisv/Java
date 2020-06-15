package OOPConceptPart2;

import OOPConceptPart2.InterfaceFiles.BrazilBank;
import OOPConceptPart2.InterfaceFiles.USBank;

public class HSBCBank implements USBank, BrazilBank {

	// If a class implements any interface, then it is mandatory to define/override all the methods
	// or prototypes declared in that interface.
	
	
	// Following methods will Override USBank interface methods
	public void credit() {
		
		System.out.println("HSBC ----> credit.");
		
	}

	
	public void debit() {
		
		System.out.println("HSBC ----> debit.");
		
	}

	
	public void moneyTransfer() {
		
		System.out.println("HSBC ----> moneyTransfer.");
		
	}
	
	
	
	// Following methods will Override BrazilBank interface methods
	public void mutualFund() {
		

		System.out.println("BrazilBank ----> mutualFund.");
		
	}


	
	public void retirementFund() {
		

		System.out.println("BrazilBank ----> retirementFund.");
		
	}
	
	
	
	// Methods belong to this class i.e. HSBCBank class.
	public void educationLoan() {
		
		System.out.println("HSBC ----> educationLoan.");
		
	}


	public void carLoan() {
	
	System.out.println("HSBC ----> carLoan.");
	
	}
	

}
