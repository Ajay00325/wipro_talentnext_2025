package java_fundamentals;
import java.util.*;
public class que_13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		for(int i=n;i<=a;i++) {
			if(i%2==0) {
				System.out.printf(i+" ");
			}
			
		}
	}

}
