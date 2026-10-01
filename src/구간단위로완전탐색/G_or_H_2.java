package 구간단위로완전탐색;
import java.util.*;

public class G_or_H_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] chr = new char[101];

        for(int i = 0; i < n; i++) {

            int location = sc.nextInt();
            char pos = sc.next().charAt(0);

            chr[location] = pos;
        }

        int max = 0;

        // 사진의 왼쪽 끝 사람
        for(int i = 0; i <= 100; i++) {

            // i 위치에 사람이 없다면 시작점이 될 수 없음
            if(chr[i] == '\0') {
                continue;
            }

            // 사진의 오른쪽 끝 사람
            for(int j = i; j <= 100; j++) {

                // j 위치에 사람이 없다면 끝점이 될 수 없음
                if(chr[j] == '\0') {
                    continue;
                }

                int gCount = 0;
                int hCount = 0;

                // 현재 사진 구간 [i ~ j] 안에 있는 사람 확인
                for(int k = i; k <= j; k++) {

                    if(chr[k] == 'G') {
                        gCount++;
                    }
                    else if(chr[k] == 'H') {
                        hCount++;
                    }
                }

                // G만 있거나
                // H만 있거나
                // G와 H의 수가 같다면
                if(gCount == 0 ||
                   hCount == 0 ||
                   gCount == hCount) {

                    max = Math.max(max, j - i);
                }
            }
        }

        System.out.println(max);
    }
}