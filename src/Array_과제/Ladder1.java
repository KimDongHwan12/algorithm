package Array_과제;

import java.util.*;

public class Ladder1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {

            int testCase = sc.nextInt();

            int[][] arr = new int[100][100];

            // 사다리 입력
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // 정답을 찾는 메서드 호출
            int answer = solution(arr);

            System.out.println("#" + testCase + " " + answer);
        }
    }


    // 최종 출발 위치를 찾는 메서드
    public static int solution(int[][] arr) {

        int row = 99;
        int col = 0;

        // 맨 아래에서 2의 위치 찾기
        for (int j = 0; j < 100; j++) {

            if (arr[99][j] == 2) {
                col = j;
                break;
            }
        }

        // 맨 위에 도착할 때까지 반복
        while (row > 0) {

            // 왼쪽으로 갈 수 있다면
            if (canMoveLeft(arr, row, col)) {

                while (canMoveLeft(arr, row, col)) {
                    col--;
                }
            }

            // 오른쪽으로 갈 수 있다면
            else if (canMoveRight(arr, row, col)) {

                while (canMoveRight(arr, row, col)) {
                    col++;
                }
            }

            // 옆으로 이동이 끝났으면 위로 이동
            row--;
        }

        // 맨 위에 도착했을 때의 열 번호가 정답
        return col;
    }


    // 왼쪽으로 이동 가능한지 확인
    public static boolean canMoveLeft(int[][] arr, int row, int col) {

        return col > 0 && arr[row][col - 1] == 1;
    }


    // 오른쪽으로 이동 가능한지 확인
    public static boolean canMoveRight(int[][] arr, int row, int col) {

        return col < 99 && arr[row][col + 1] == 1;
    }
}