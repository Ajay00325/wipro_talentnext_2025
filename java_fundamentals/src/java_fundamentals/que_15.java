package java_fundamentals;
import java.util.*;
public class que_15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int count=0;
		for(int i=n;i<=a;i++) {
			check(i);
			
	}
		

}
	public static void  check(int i) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.printf(i+" ");
		}
		
		
	}
}
