package java_fundamentals;
import java.util.*;
public class que_14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1) {
			System.out.println("This is prime");
		}
		else {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("This is an prime");
			}
			else {
				System.out.println("This is not prime");
			}
		}
			
		}
	

}
