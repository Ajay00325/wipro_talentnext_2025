package arrays_foundamentals;

import java.util.Scanner;

public class que_24 {

	public static void main(String[] args) {
		check();
	}

	public static void check() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		char[] arr1 = new char[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			arr1[i] = (char) arr[i];
		}
		for (char i : arr1) {
			System.out.printf(i + " ");
		}
	}
}
