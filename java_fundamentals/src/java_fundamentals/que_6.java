package java_fundamentals;
import java.util.*;

public class que_6 {
	public static String[] check(String a) {
		String[] words=a.split("\\s+");
		//split("\\s+") is used to splits based on the one or more spaces
		//.trim() is used to remove leading/trailing spaces
		return words;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String[] arr=check(a);
		if(arr.length<=1) {
			System.out.println("No values");
		}
		else {
			
			for(String arr1:arr) {
				System.out.print(arr1+" ");
			}
			
		}
		
	}

}
