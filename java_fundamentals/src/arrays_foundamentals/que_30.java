package arrays_foundamentals;
import java.util.*;

public class que_30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int start = 0;
        int end = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                arr1[start++] = arr[i]; // odd at front
            } else {
                arr1[end--] = arr[i]; // even at back
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}
