package Queue_LinkedList;

import java.util.*;

public class 준홍이의_카드놀이 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] count = new int[N + M + 1];

            for (int i = 1; i <= N; i++) {

                for (int j = 1; j <= M; j++) {

                    count[i + j]++;
                }
            }

            int max = 0;

            for (int i = 2; i <= N + M; i++) {

                if (count[i] > max) {
                    max = count[i];
                }
            }

            System.out.print("#" + tc + " ");

            for (int i = 2; i <= N + M; i++) {

                if (count[i] == max) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }
    }
}
