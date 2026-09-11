package String_Stack;

import java.util.*;

public class 회문2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 10개
        for (int test = 0; test < 10; test++) {

            // 회문2에서는 테스트 케이스 번호가 입력으로 주어짐
            int tc = sc.nextInt();

            char[][] arr = new char[100][100];

            // 100 x 100 문자 배열 입력
            for (int i = 0; i < 100; i++) {

                String str = sc.next();

                for (int j = 0; j < 100; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            int answer = search(arr);

            System.out.println("#" + tc + " " + answer);
        }

    }


    public static int search(char[][] arr) {

        // 가장 긴 길이부터 검사
        for (int length = 100; length >= 1; length--) {

            // i : 행 또는 열 번호
            for (int i = 0; i < 100; i++) {

                // j : 회문 검사를 시작할 위치
                for (int j = 0; j <= 100 - length; j++) {

                    boolean rowPalindrome = true;
                    boolean colPalindrome = true;

                    // 양쪽 끝에서 가운데로 비교
                    for (int k = 0; k < length / 2; k++) {

                        // 가로 회문 검사
                        if (arr[i][j + k]
                                != arr[i][j + length - 1 - k]) {

                            rowPalindrome = false;
                        }

                        // 세로 회문 검사
                        if (arr[j + k][i]
                                != arr[j + length - 1 - k][i]) {

                            colPalindrome = false;
                        }
                    }

                    // 가로나 세로 둘 중 하나라도 회문이면
                    // 현재 length가 가장 긴 길이
                    if (rowPalindrome || colPalindrome) {
                        return length;
                    }
                }
            }
        }

        return 1;
    }
}