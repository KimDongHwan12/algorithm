package 구간단위로완전탐색;

import java.util.*;

public class 특정구간의원소평균값 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // i = 구간 시작점
        for(int i = 0; i < n; i++) {

            // j = 구간 끝점
            for(int j = i; j < n; j++) {

                int sum = 0;

                // 현재 구간 [i ~ j]의 합
                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                int length = j - i + 1;

                // 현재 구간 [i ~ j] 안에서
                // 평균과 같은 원소가 있는지 확인
                for(int k = i; k <= j; k++) {

                    // 평균 == arr[k]
                    // sum / length == arr[k]
                    // 정수 나눗셈 문제를 피하기 위해 곱셈으로 비교
                    if(sum == arr[k] * length) {
                        count++;

                        // 이 구간은 이미 조건을 만족했으므로 종료
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}