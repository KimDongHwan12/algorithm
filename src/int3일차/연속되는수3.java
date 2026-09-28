package int3일차;

import java.util.*;

public class 연속되는수3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int count_plus = 0;
        int count_minus = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 양수 연속 길이
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                count_plus++;
            } else {
                count_plus = 0;
            }

            result = Math.max(result, count_plus);
        }

        // 음수 연속 길이
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                count_minus++;
            } else {
                count_minus = 0;
            }

            result = Math.max(result, count_minus);
        }

        System.out.println(result);
    }
}

