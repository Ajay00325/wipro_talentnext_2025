package java_fundamentals;
import java.util.*;
public class que_5 {
	public static void check(int n) {
		if(n%2==0) {
			System.out.println("This is even number");
		}
		else {
			System.out.println("This is odd number");
		}
	}
  
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		check(n);
	}

}
