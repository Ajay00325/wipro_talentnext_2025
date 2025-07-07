package arrays_foundamentals;
import java.util.*;
public class que_27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Set<Integer> duplicate=new HashSet<>();
		for(int i=0;i<n;i++) {
			duplicate.add(arr[i]);
		}
		for(int i:duplicate) {
			System.out.print(i+" ");
		}
	}

}