package arrays_foundamentals;
import java.util.*;
public class que_33 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int k=0;
		int[] arr1=new int[2];
		int[][] arr=new int[2][3];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=s.nextInt();
				k=3/2;
				if(j==k) {
					arr1[i]=arr[i][j];
				}
			}
			
		}
		
			System.out.print(Arrays.toString(arr1));
		
		
	}

}
