package oopexercises;

public class BankaccountApp {

	public static void main(String[] args) {
		// Creating a new bank account>> think instantiate an object
		
		BankAccount acc1=new BankAccount();
		acc1.accountNumber = "9038";
	acc1.setName("Hong");
		acc1.balance = 10000;
		acc1.setSsn("293847");
		System.out.println("SSN: "+ acc1.getSsn());
		System.out.println(acc1.toString());
		
		
		acc1.checkBalance();
		acc1.deposit(10000);
		acc1.checkBalance();
		acc1.withdraw(5000);
		acc1.checkBalance();
		
		System.out.println(acc1.toString());
		acc1.setRate();
		acc1.increaseRate();
		acc1.setRate();
	
		
		
		/*BankAccount acc2=new BankAccount("Checking Account");
		
		BankAccount acc3=new BankAccount("Savings Account",1000);
		acc3.accountNumber="12434";
		acc3.checkBalance();
		
		//Demo for Inheritance
		
		CDaccount cd1=new CDaccount();
		cd1.balance = 3000;
		cd1.name = "Ju";
		cd1.interestRate= "4.5";
		System.out.println(cd1.toString());
		cd1.compount(); 
		*/

	}

}
