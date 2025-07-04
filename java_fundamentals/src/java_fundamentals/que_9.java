package java_fundamentals;
import java.util.*;
public class que_9 {

	public static void main(String[] args) {
		Scanner  s=new Scanner(System.in);
		char c=s.next().charAt(0);
		char d=Character.toLowerCase(c);
		if(c==d) {
			char e=Character.toUpperCase(c);
			System.out.println(e);
		}
		else {
		System.out.println(d);
		}
		
	}

}
