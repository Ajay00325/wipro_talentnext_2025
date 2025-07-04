package java_fundamentals;
import java.util.*;
public class que_16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int a=Character.getNumericValue(ch);
			sum=sum+a;
		}
		System.out.println(sum);
	}

}
