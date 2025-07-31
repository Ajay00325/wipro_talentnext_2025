package String_stringBuffer;
import java.util.*;
public class que_8 {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String sb=new StringBuffer(a).reverse().toString();
	
	if(a.equals(sb)) {
		System.out.print(a+" is palindrome");
	}
	else {
		System.out.print(a+" is not palindrome");
	}
}
}
