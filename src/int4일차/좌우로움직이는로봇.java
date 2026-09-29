package int4일차;

import java.util.*;

public class 좌우로움직이는로봇 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[2000000];
        int[] b = new int[2000000];

        // A 이동
        int timeA = 0;
        int posA = 0;

        for (int i = 0; i < n; i++) {

            int command = sc.nextInt();
            char direction = sc.next().charAt(0);

            for (int j = 0; j < command; j++) {

                if (direction == 'R') {
                    posA++;
                } else {
                    posA--;
                }

                a[timeA] = posA;
                timeA++;
            }
        }

        // B 이동
        int timeB = 0;
        int posB = 0;

        for (int i = 0; i < m; i++) {

            int command = sc.nextInt();
            char direction = sc.next().charAt(0);

            for (int j = 0; j < command; j++) {

                if (direction == 'R') {
                    posB++;
                } else {
                    posB--;
                }

                b[timeB] = posB;
                timeB++;
            }
        }

        int maxTime = Math.max(timeA, timeB);

        // 먼저 이동을 끝낸 로봇은 마지막 위치에 계속 서 있음
        for (int i = timeA; i < maxTime; i++) {
            a[i] = posA;
        }

        for (int i = timeB; i < maxTime; i++) {
            b[i] = posB;
        }

        // 만나는 횟수 계산
        int count = 0;

        for (int i = 1; i < maxTime; i++) {

            if (a[i] == b[i] && a[i - 1] != b[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}