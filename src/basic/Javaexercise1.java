package basic;
import java.util.*;

public class Javaexercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		double number=a.nextDouble();
		double bb=ConvertFtoC(number);
		System.out.print(bb);

	}

	private static double ConvertFtoC(double num) {
		// TODO Auto-generated method stub
		double aa=((5*(num-32.0))/9.0);
return aa;	}

}
