package basic;
import java.util.*;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number : ");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int num=addnum(a);
		System.out.print("Number : "+num);
		
	}

	private static int addnum(int a) {
		// TODO Auto-generated method stub
		return a+1;
	}

}
