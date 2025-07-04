package java_fundamentals;
import java.util.*;
public class que_8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1="Male";
		int age=20;;
		
		if(s1=="Male") {
			if(age<=59) {
				System.out.println("8.4%");
			}
			else {
				System.out.println("10.5%");
			}
		}
		else if(s1=="Female") {
			if(age<=58) {
				System.out.println("8.2%");
			}
			else {
				System.out.println("9.2%");
			}
		}

	}

}
