package arrays_foundamentals;

import java.util.*;

public class que_32 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int index = 0;
		int index1 = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			if (arr[i] == 6) {
				index = i;
			}
			if (arr[i] == 7) {
				index = i;
			}
		}
		int sum = 0;

		if (index < index1) {
			for (int i = 0; i < n; i++) {
				if (i < index || i > index1) {
					sum += arr[i];
				}
			}
		} 
		else {
			for (int i = 0; i < n; i++) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
