package 부분집합;

import java.util.Scanner;

public class 햄버거다이어트_재귀함수 {

    static int N;
    static int L;

    static int[] score;
    static int[] calorie;

    static int max;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            N = sc.nextInt();
            L = sc.nextInt();

            score = new int[N];
            calorie = new int[N];

            for (int i = 0; i < N; i++) {

                score[i] = sc.nextInt();
                calorie[i] = sc.nextInt();
            }

            max = 0;

            hamburger(0, 0, 0);

            System.out.println("#" + tc + " " + max);
        }
    }


    public static void hamburger(int index, int sumScore, int sumCalorie) {

        if (sumCalorie > L) {
            return;
        }

        if (index == N) {

            if (sumScore > max) {
                max = sumScore;
            }

            return;
        }


        // 현재 재료를 선택한다
        hamburger(
                index + 1,
                sumScore + score[index],
                sumCalorie + calorie[index]
        );


        // 현재 재료를 선택하지 않는다
        hamburger(
                index + 1,
                sumScore,
                sumCalorie
        );
    }
}