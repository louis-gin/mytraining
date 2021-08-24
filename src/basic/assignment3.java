package basic;
import java.util.*;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-2,-3,1,2,3,9,2,4};
		System.out.println(min(a));
		
		System.out.println(ave(a));
		System.out.println(max(a));
	
		}

	private static int ave(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int max(int[] a) {
		// TODO Auto-generated method stub
		int maxbvalue=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxbvalue) {
				maxbvalue=a[i];
			}
		}
		
		return maxbvalue;
	}

	private static int min(int[] a) {
		// TODO Auto-generated method stub
		int minbvalue=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<minbvalue) {
				minbvalue=a[i];
			}
		}
		
		return minbvalue;
	}

}


