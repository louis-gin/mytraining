package basic;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factoril(5));

	}

	private static int factoril(int n) {
		// TODO Auto-generated method stub
		//recursive method
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		System.out.println(n);
		return (n*factoril(n-1));
	}

}
