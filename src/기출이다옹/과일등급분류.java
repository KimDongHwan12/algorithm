package 기출이다옹;
import java.util.*;

public class 과일등급분류 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            int lo = sc.nextInt();
            int hi = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int answer = solution(arr, N, lo, hi);

            System.out.println("#" + tc + " " + answer);
        }
    }


    public static int solution(int[] arr, int N, int lo, int hi) {

        Arrays.sort(arr);

        int answer = Integer.MAX_VALUE;

        for (int i = lo; i <= hi; i++) {

            if (i >= N || arr[i - 1] == arr[i]) {
                continue;
            }


            for (int j = i + lo; j <= N - lo; j++) {

                int economy = i;
                int standard = j - i;
                int premium = N - j;

                if (standard > hi) {
                    break;
                }


                if (premium > hi) {
                    continue;
                }


                if (arr[j - 1] == arr[j]) {
                    continue;
                }


                int max = Math.max(
                        economy,
                        Math.max(standard, premium)
                );


                int min = Math.min(
                        economy,
                        Math.min(standard, premium)
                );


                int difference = max - min;


                answer = Math.min(answer, difference);
            }
        }


        if (answer == Integer.MAX_VALUE) {
            return -1;
        }

        return answer;
    }
}