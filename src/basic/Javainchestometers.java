package basic;
import java.util.*;

public class Javainchestometers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ininput=new Scanner(System.in);
		double in=ininput.nextDouble();
		double a=inchestometers(in);
		System.out.print(a);

	}

	private static double inchestometers(double in) {
		// TODO Auto-generated method stub
		double intom=in/39.370;
		return intom;
	}

}
