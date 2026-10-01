package 자리수단위로완탐;

import java.util.*;

public class 오목 {

    static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];

        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 0;
        int y = 0;
        int winner = 0;

        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {

                // 돌이 없는 곳은 볼 필요 없음
                if(arr[i][j] == 0) {
                    continue;
                }

                // 현재 돌에서 8방향 탐색
                for(int d = 0; d < 8; d++) {

                    // 현재 위치의 돌을 포함하기 때문에 1
                    int count = 1;

                    // 현재 돌을 제외하고 앞으로 4개 확인
                    for(int k = 1; k <= 4; k++) {

                        int nr = i + dr[d] * k;
                        int nc = j + dc[d] * k;

                        // 범위를 벗어나면 이 방향은 실패
                        if(nr < 0 || nr >= 19 ||
                           nc < 0 || nc >= 19) {
                            break;
                        }

                        // 같은 색 돌이 아니라면 실패
                        if(arr[nr][nc] != arr[i][j]) {
                            break;
                        }

                        count++;
                    }

                    // 5개 연속 발견
                    if(count == 5) {

                        winner = arr[i][j];

                        // 5개의 가운데 돌은 시작점에서 2칸 이동
                        x = i + dr[d] * 2;
                        y = j + dc[d] * 2;

                        break;
                    }
                }

                if(winner != 0) {
                    break;
                }
            }

            if(winner != 0) {
                break;
            }
        }

        // 승부가 나지 않은 경우
        if(winner == 0) {
            System.out.println(0);
        }

        // 승부가 난 경우
        else {
            System.out.println(winner);
            System.out.println((x + 1) + " " + (y + 1));
        }
    }
}