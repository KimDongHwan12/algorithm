package 구간단위로완전탐색;

import java.util.*;

public class 바구니안의사탕2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] candy = new int[101];

        for(int i = 0; i < n; i++) {

            int x = sc.nextInt(); // 사탕 개수
            int y = sc.nextInt(); // 바구니 위치

            candy[y] += x;
        }

        int answer = 0;

        // i를 중심점 c라고 생각
        for(int i = 0; i < 101; i++) {

            // 중심에서 왼쪽 k, 오른쪽 k
            // 배열 범위를 벗어나면 0~100으로 잘라줌
            int left = Math.max(0, i - k);
            int right = Math.min(100, i + k);

            int sum = 0;

            // [left ~ right] 안의 사탕 합
            for(int j = left; j <= right; j++) {
                sum += candy[j];
            }

            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}