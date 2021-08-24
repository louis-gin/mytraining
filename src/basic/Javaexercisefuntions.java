package basic;
import java.util.*;

public class Javaexercisefuntions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number1=new Scanner(System.in);
		System.out.print("First integer : ");
		int num1=number1.nextInt();
		
		Scanner number2=new Scanner(System.in);
		System.out.print("Second integer : ");
		int num2=number2.nextInt();
		
		
		sumnumbers(num1,num2);
		difference(num1,num2);
		productnumbers(num1,num2);
		averageint(num1,num2);
		distanceint(num1,num2);
		maxint(num1,num2);
		minint(num1,num2);

	}

	private static void minint(int num1, int num2) {
		// TODO Auto-generated method stub
		int a=Math.min(num2, num2);
		System.out.println("Min integer : "+a);
	}

	private static void maxint(int num1, int num2) {
		// TODO Auto-generated method stub
		int a=Math.max(num2, num2);
		System.out.println("Max integer : "+a);
	}

	private static void distanceint(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1>num2) {
			int a=Math.abs(num1-num2);
			System.out.println("Distance of two integers : "+a);
		}
		else {
			int a=Math.abs(num2-num1);
			System.out.println("Distance of two integers : "+a);
		}
		
	}

	private static void averageint(int num1, int num2) {
		// TODO Auto-generated method stub
		int a=(num1+num2)/2;
				System.out.println("Average of two integers : "+a);
		
	}

	private static void productnumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		int a=num1*num2;
		System.out.println("Product of two integers : "+a);
		
	}

	private static void difference(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1>num2) {
			int a=num1-num2;
			System.out.println("Difference of two integers : "+a);
		}
		else {
			int a=num2-num1;
			System.out.println("Difference of two integers : "+a);
		}
		
	}

	private static void sumnumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		int a=num1 + num2;
		System.out.println("Sum of two integers : "+a);
	}

}
