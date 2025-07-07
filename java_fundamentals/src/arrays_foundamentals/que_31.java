package arrays_foundamentals;
import java.util.*;

public class que_31 {

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,4};
	  boolean a=true;
		for(int i=0;i<4;i++) {
			
			if(arr[i]!=1 && arr[i]!=4) {
				a=false;
				break;
			}
		}
		System.out.print(a);
		
	}

}
