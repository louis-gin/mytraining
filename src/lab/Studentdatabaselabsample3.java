package lab;

public class Studentdatabaselabsample3 {

	public static void main(String[] args) {

		//student3 acc1 = new student3("Tom", "123512");

		//System.out.println(acc1.toString());

		}



		



		class student3 {

		// Properties of student

		//private static int internalID = 1000;

		private String Phone;

		private String City;

		private String State;

		private String SSN;

		private String ID;

		private String name;

		private int Balance = 1000;

		private double amount = 500;

		//Constructor

		public student3(String name, String SSN) {

		this.name = name;

		this.SSN = SSN;

	//	internalID++;

		setID();

		createEmail();

		pay(amount);

		}

		private void setID() {

		int random = (int)(Math.random() * 10000);

		//ID = internalID + "" + random + SSN.substring(SSN.length()-4, SSN.length() );

		System.out.println("Your unique student ID is :" + ID);

		}

		private void createEmail() {

		String email = name + "@gmail.com";

		System.out.println("Your new email is :" + email);

		}

		public void setPhone(String Phone) {

		this.Phone = Phone;

		}

		public String getPhone() {

		return Phone;

		}

		public void setCity(String City) {

		this.City = City;

		}

		public String getCity() {

		return City;

		}

		public void setState(String State) {

		this.State = State;

		}

		public String getState() {

		return State;

		    }

		public String toString() {

		return "Your Name is " + name + " " +  "and your SSN is: " + SSN;

		}

		public void pay(double amount) {

		Balance = (int) (Balance - amount);

		System.out.println("Paying bill: " + amount);

		checkBalance();

		}

		public void checkBalance() {

		System.out.println("Your new balance is :" + Balance);

		}

		}
}

