package arrays_foundamentals;

import java.util.Scanner;
public class que_23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int target=s.nextInt();
		int[] arr=new int[n];
		boolean c=false;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			if(arr[i]==target) {
				System.out.println(i);
				c=true;
				break;
			}
			
		}
		if(c==false) {
			System.out.println("-1");
		}
	

}
}
