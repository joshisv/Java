package OOPConceptPart2;

import OOPConceptPart2.InterfaceFiles.USBank;

public class TestBank {

	public static void main(String[] args) {
		

		// Instantiation
		HSBCBank hs = new HSBCBank();
		
		
		hs.credit();
		hs.debit();
		hs.moneyTransfer();
		
		hs.mutualFund();
		hs.retirementFund();
		
		hs.educationLoan();
		hs.carLoan();
		
		
		// Child class object can be referred by parent interface reference variable.
		System.out.println("************************************");
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.moneyTransfer();
		
		// To print variable value of an interface we can use interface name
		System.out.format("Min Balance: $%d%n", USBank.min_balance);

	}

}
