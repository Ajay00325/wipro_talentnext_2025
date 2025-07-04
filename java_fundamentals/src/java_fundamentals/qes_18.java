package java_fundamentals;
import java.util.*;
public class qes_18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String reverse="";
		for(int i=a.length()-1;i>=0;i--) {
			reverse+=a.charAt(i);
		}
		System.out.println(reverse);
	}

}
