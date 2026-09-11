package 부분집합;

import java.util.*;

public class 부분수열_비트마스킹 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;  

            for (int bit = 0; bit < (1 << N); bit++) {

                int sum = 0;

                for (int i = 0; i < N; i++) {

                    if ((bit & (1 << i)) != 0) {
                        sum += arr[i];
                    }
                }

                if (sum == K) {
                    count++;
                }
            }

            System.out.println("#" + tc + " " + count);
        }
    }
}
