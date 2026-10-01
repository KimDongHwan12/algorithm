package 자리수단위로완탐;

import java.util.*;
/**
 * 1. 고정되어 있는 것은?
→ 시작 (0,0)
→ 도착 (r-1,c-1)

2. 내가 직접 골라야 하는 것은?
→ 중간 위치 2개
→ (i,j), (k,l)

3. 각각의 범위는?
→ 시작/도착 제외
→ 1 ~ r-2
→ 1 ~ c-2

4. 두 선택 사이의 관계는?
→ 두 번째 위치는 첫 번째 위치의 오른쪽 아래
→ k > i
→ l > j

5. 선택한 뒤 검사할 조건은?
→ 이동할 때마다 색이 달라야 함

6. 조건 만족 시 무엇을 할까?
→ 경로 1개 발견
→ answer++
 */
public class 체크판위에서2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] arr = new char[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        int answer = 0;

        // 첫 번째로 이동할 위치
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {

                // 두 번째로 이동할 위치
                for (int k = i + 1; k < r - 1; k++) {
                    for (int l = j + 1; l < c - 1; l++) {

                        if (arr[0][0] != arr[i][j] &&
                            arr[i][j] != arr[k][l] &&
                            arr[k][l] != arr[r - 1][c - 1]) {

                            answer++;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}