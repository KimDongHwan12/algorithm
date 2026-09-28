package int4일차;

import java.util.*;

public class 벌금은누구에게 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;
        int time = 0;

        int[] a = new int[1000000];
        int[] b = new int[1000000];

        // A 이동
        for (int i = 0; i < n; i++) {

            char d = sc.next().charAt(0);
            int line = sc.nextInt();

            if (d == 'R') {

                for (int j = 0; j < line; j++) {
                    count++;

                    a[time] = count;
                    time++;
                }

            } else {

                for (int j = 0; j < line; j++) {
                    count--;

                    a[time] = count;
                    time++;
                }
            }
        }

        int totalTime = time;

        // B를 위해 초기화
        count = 0;
        time = 0;

        // B 이동
        for (int i = 0; i < m; i++) {

            char d = sc.next().charAt(0);
            int line = sc.nextInt();

            if (d == 'R') {

                for (int j = 0; j < line; j++) {
                    count++;

                    b[time] = count;
                    time++;
                }

            } else {

                for (int j = 0; j < line; j++) {
                    count--;

                    b[time] = count;
                    time++;
                }
            }
        }

        int result = -1;

        for (int i = 0; i < totalTime; i++) {

            if (a[i] == b[i]) {
                result = i + 1;
                break;
            }
        }

        System.out.println(result);
    }
}