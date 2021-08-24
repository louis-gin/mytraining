package lab;

public class BankAccountapplab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1=new BankAccount("24343445",10000.50);
		BankAccount acc2=new BankAccount("293784589",50000);
		BankAccount acc3=new BankAccount("339308483",80000);
		
		acc1.setName("John");
		System.out.println(acc1.getName());
		acc1.deposit(500);
		acc1.deposit(600);
		acc1.paybills(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements Iinterest{
	
	//properties of bank account
	private static int ID= 1000;		// Internal ID
	private String accountNumber;		// ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber="0098987";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN,double amount) {
		balance=amount;
		System.out.println("New Account created");
		this.SSN=SSN;
		ID++;
		setAccountNumber();
	}

	private void setAccountNumber() {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*100);
		System.out.println(random);
		accountNumber =ID +random+SSN.substring(0,2);
		System.out.println(accountNumber);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposit: $"+amount);
		showActivity();
		
		
	}
	
	private void showActivity() {
		// TODO Auto-generated method stub
		System.out.println("Balance: $"+balance);
	}

	public void paybills(double amount) {
		balance=balance-amount;
		System.out.println("Paybill: $"+amount);
		showActivity();
	}


	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance= balance * (1 + rate/100);
		showActivity();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: "  + routingNumber + "]\n"+"[Balance: $"+ balance + "]";
		
	}
	
}
