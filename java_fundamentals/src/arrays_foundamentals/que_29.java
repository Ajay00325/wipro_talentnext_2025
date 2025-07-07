package arrays_foundamentals;

import java.util.*;

public class que_29 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (arr[i] != 10) {
                arr1[count++] = arr[i]; 
            }
        }

        while (count < n) {
            arr1[count++] = 0;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
