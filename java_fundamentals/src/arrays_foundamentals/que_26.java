package arrays_foundamentals;
import java.util.*;
public class que_26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
