package arrays_foundamentals;

import java.util.*;

public class que_25 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[0]+",");
		System.out.println(arr[1]);
	    System.out.printf(arr[arr.length-1]+",");
	    System.out.print(arr[arr.length-2]);
}

}
