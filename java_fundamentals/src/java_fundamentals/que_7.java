package java_fundamentals;
import java.util.*;
public class que_7 {
	

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		char ch1=s.next().charAt(0);
		char ch2=s.next().charAt(0);
		int a=Character.getNumericValue(ch1);
		int b=Character.getNumericValue(ch2);
		if(a>b) {
			System.out.println(ch2+" , "+ch1);
		}
		else {
			System.out.println(ch1+" , "+ch2);
		}
	}

}
