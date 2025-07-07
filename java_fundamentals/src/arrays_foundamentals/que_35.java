package arrays_foundamentals;
import java.util.*;
public class que_35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		int k = 0;
		int[] newNums = new int[size];
		for(int i=0;i<nums.length;i++) {
			boolean isTrue = check(newNums, nums[i]);
			if(isTrue) {
				newNums[k++] = nums[i];
			}
			
		}
		for(int i=0;i<k;i++) {
			System.out.print(newNums[i] + " ");
		}
		int high=0;
		
	}
	
	
	static boolean check(int[] newNums, int j) {
		for(int i=0;i<newNums.length;i++) {
			if(j == newNums[i]) return false;
		}
		return true;

}}
