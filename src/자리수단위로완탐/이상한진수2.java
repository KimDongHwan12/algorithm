package 자리수단위로완탐;

import java.util.*;

public class 이상한진수2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        int answer = 0;

        // 어느 한 자리가 바뀌었는지 모르므로
        // 모든 자리를 하나씩 바꿔본다.
        for (int i = 0; i < arr.length; i++) {

            // i번째 자리 뒤집기
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }

            // 현재 이진수를 10진수로 변환
            int num = 0;

            for (int j = 0; j < arr.length; j++) {

                // 1인 자리만 자리값을 더한다.
                if (arr[j] == '1') {
                    num += (int)Math.pow(2, arr.length - 1 - j);
                }
            }

            answer = Math.max(answer, num);

            // 원상복구
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }
        }

        System.out.println(answer);
    }
}