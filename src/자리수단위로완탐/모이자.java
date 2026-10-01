package 자리수단위로완탐;

import java.util.*;

public class 모이자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long min = Long.MAX_VALUE;

        // i = 사람들이 모일 집
        for (int i = 0; i < n; i++) {

            long sum = 0;

            // j = 사람들이 출발하는 집
            for (int j = 0; j < n; j++) {

                int distance = Math.abs(i - j);

                sum += (long) arr[j] * distance;
            }

            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}