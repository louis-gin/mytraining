package lab;

import java.util.Random;



public class Studentdatabasesample {



public static void main(String[] args) {

// TODO Auto-generated method stub

Students stu1 = new Students("45678900");

stu1.setName("Jill");

stu1.enroll();

stu1.setCity("Toronto");

stu1.getCity();

stu1.setPhone("14376645476");

stu1.getPhone();

stu1.setState("Ontario");

stu1.getState();

System.out.println("\n--- Your Profile Info: ---\nName: " + stu1.getName() + "\nCity: " + stu1.getCity() + "\nState: " +stu1.getState() + "\nPhone: " +stu1.getPhone());

stu1.checkBalance();

stu1.pay(900.5);

stu1.addCourse("Math");

stu1.addCourse("English");

stu1.addCourse("Science");

stu1.addCourse("Social Science");

stu1.addCourse("Economics");

stu1.addCourse("Geography");

stu1.displayCourses();

}

}

class Students {

private String SSN;

private String name;

private String email;

private static int iD =100;

private String userID;

private String phone;

private String city;

private String state;

private static final double fee = 900.50;

private double balance = fee;

private String[] courses = new String[5];

//Constructor

public Students(String SSN) {

this.SSN = SSN;

}

//Getters and Setters



public String getName() {

return name;

}



public void setName(String name) {

this.name = name;

}



public String getPhone() {

return phone;

}



public void setPhone(String phone) {

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

public void enroll() {

System.out.println("You have been enrolled");

createEmail();

createUserID();

}

//Creating Email

public void createEmail() {

email = name+"@mymail.com";

System.out.println("Your Email Address is: " +email);

}

//Creating Email and UserID

public void createUserID() {

Random r = new Random();

int Result = r.nextInt(9000-1000) + 1000;

userID = iD + ""+ Result + SSN.substring(4);

System.out.println("Your UserID is: "+userID);

}

//Pay Fee

public void pay(double payment) {

balance -= payment;

System.out.println("\nMaking Payment of " +payment);

checkBalance();

}

public void checkBalance() {

System.out.println("\nChecking Balance");

if (balance >0) {

System.out.println("Your remaining balance is: " +balance);

}

else {

System.out.println("Your balance is clear.");

}

}

//Adding and displaying courses

public void addCourse(String course) {

for(int i =0; i<5; i++) {

if(courses[i] == null) {

courses[i] = course;

break;

}

}

}

public void displayCourses() {

//displaying courses

System.out.println("\n--- Added Courses--- ");

for(int i=0; i<5; i++) {

if(courses[i] != null) {

System.out.println("\n" + courses[i]);

}

}

}

}
