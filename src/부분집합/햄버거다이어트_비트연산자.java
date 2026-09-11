package 부분집합;

import java.util.Scanner;

public class 햄버거다이어트_비트연산자 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            int L = sc.nextInt();

            int[] score = new int[N];
            int[] calorie = new int[N];

            for (int i = 0; i < N; i++) {
                score[i] = sc.nextInt();
                calorie[i] = sc.nextInt();
            }

            int max = 0;

            for (int bit = 0; bit < (1 << N); bit++) {

                int sumScore = 0;
                int sumCalorie = 0;

                for (int i = 0; i < N; i++) {

                    if ((bit & (1 << i)) != 0) {

                        sumScore += score[i];
                        sumCalorie += calorie[i];
                    }
                }

                if (sumCalorie <= L) {
                    max = Math.max(max, sumScore);
                }
            }

            System.out.println("#" + tc + " " + max);
        }
    }
}