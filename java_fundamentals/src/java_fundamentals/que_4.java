package java_fundamentals;
import java.util.*;
public class que_4 {
	public static String check(int n) {

	String count="0";
	if(n>0) {
		 count="1";
	}
	else if(n==0)
	{
		
		count="2";
     }
	else {
		
		count="3";
	}
	return count;
	}
	public static boolean last(int a,int b) {
		if(a%10== b%10)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		String s1=check(n);
		if(s1=="1") {
			System.out.println(n+" is a positive integer");
		}
		else if(s1=="2") {
			System.out.println("This is 0 value");
		}
		else {
			System.out.println(n+"this is an the negative number");
		}
		boolean s2=last(n,a);
		System.out.println(n+" "+a+" are "+s2);
}
}