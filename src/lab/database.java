package lab;

public class database {
	//properties of student database
	String name;
	String SSN;
    private static int ID=100; //Internal ID
    private static int emailID=100;
   private String userID; // ID + random 4-digit number + last 4 of SSN
    private int phone;
    private String city;
    private String state;
    private String courses="";
    private static final int costofCourse=1000;
    private int balance=0;
    
 // constructor that takes name and SSN in the arguments   
public database(String name, String SSN) {
	System.out.println("Account created");
	this.name=name;
	System.out.println("Student: "+name);
	this.SSN=SSN;
	ID++;
	emailID++;
	setemailID(name);
	setUserID();
	
}



private void setemailID(String name) {
	// TODO Auto-generated method stub
	System.out.println("Email ID: "+name+"."+emailID+"@studentdatabase.com");
	
}



// Methods
private void setUserID() {
	// TODO Auto-generated method stub
	int max=9000;
	int min=1000;
	int random = (int)(Math.random()*(max-min));
	//random=random+min;
	//System.out.println(random);
	userID =ID +random+SSN.substring(5);
	System.out.println("User ID: "+userID);
	
}



public void enroll(String course) {
	this.courses=this.courses+"\n"+course;
	//System.out.println("Enroll to "+ courses);
	balance=balance+costofCourse;
}

public void pay(int amount) {
	System.out.println("Payment: $"+amount);
	balance=balance-amount;
	
	
}

public void checkBalance() {
	System.out.println("Balance: $"+balance);
	
	
}

public void showCourses() {
	System.out.print("\nCourses");
	System.out.println(courses);
	
}



 // use encapsulation to set variable ( phone, city, state )
public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "[Name: "+name+"]\n[Courses: "+courses+"]\nBalance: $"+balance+"]";
}

}
