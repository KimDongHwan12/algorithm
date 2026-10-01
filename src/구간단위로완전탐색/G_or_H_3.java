package 구간단위로완전탐색;
import java.util.*;

public class G_or_H_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        // 좌표 10000도 사용해야 하므로 10001칸
        int[] location = new int[10001];

        for(int i = 0; i < n; i++) {

            int x = sc.nextInt();
            char pos = sc.next().charAt(0);

            if(pos == 'G') {
                location[x] = 1;
            }
            else {
                location[x] = 2;
            }
        }

        int max = 0;

        // i + k가 10000까지 가능
        for(int i = 0; i <= 10000 - k; i++) {

            int sum = 0;

            // i부터 i+k까지 확인
            for(int j = 0; j <= k; j++) {
                sum += location[i + j];
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}