package 자리수단위로완탐;

import java.util.*;

public class 최고의13위치2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 2; j++) {

                int sum1 =arr[i][j]+ arr[i][j + 1]+ arr[i][j + 2];

                for(int k = 0; k < n; k++) {
                    for(int l = 0; l < n - 2; l++) {

                        if(i == k && Math.abs(j - l) <= 2) {
                            continue;
                        }

                        int sum2 =arr[k][l] + arr[k][l + 1] + arr[k][l + 2];
                        int sum = sum1 + sum2;

                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
