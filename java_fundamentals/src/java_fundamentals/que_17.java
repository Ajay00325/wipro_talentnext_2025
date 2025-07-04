package java_fundamentals;
import java.util.*;
public class que_17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   for(int i=0;i<=n+1;i++) {
		   for(int j=1;j<i;j++) {
			   System.out.printf("* ");
		   }
		   System.out.println(" ");
	   }
	}

}
