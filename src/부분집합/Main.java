package 부분집합;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            String str = sc.next();
            char[] chr = str.toCharArray();

            String answer = "NONE";

            for (int i = 0; i <= N - M; i++) {

                boolean check = true;

                for (int j = 0; j < M / 2; j++) {

                    if (chr[i + j] != chr[i + M - 1 - j]) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    answer = str.substring(i, i + M);
                    break;
                }
            }

            System.out.println("#" + tc + " " + answer);
        }
    }
}