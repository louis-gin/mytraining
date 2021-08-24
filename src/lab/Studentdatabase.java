package lab;

public class Studentdatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		database student1=new database("John","001234123");
		student1.setCity("New York");
		student1.setPhone(12345679);
		student1.setState("QQ");
		student1.checkBalance();
		student1.enroll("Math");
		student1.enroll("Eng");
		student1.enroll("Phy");
		student1.checkBalance();
		student1.pay(600);
		student1.checkBalance();
		student1.showCourses();
		student1.checkBalance();
		System.out.println("City: "+student1.getCity());
		System.out.println("Contact: "+student1.getPhone());
		System.out.println("State: "+student1.getState());
		System.out.println(student1.toString());
		System.out.println("*****************************");
		
		

	}

}
