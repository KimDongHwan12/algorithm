package 구간단위로완전탐색;
import java.util.*;

public class G_or_H_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] location = new int[10000];
		
		for(int i = 0; i<n ; i++) {
			int x = sc.nextInt();
			char pos = sc.next().charAt(0);
			
			if(pos =='G') {
				location[x] = 1;
			}else {
				location[x] = 2;
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < 10000-k+1; i++) {
            int sum = 0;
            for (int j = 0; j <= k; j++) {
                sum += location[i+j];
            }
            max = Math.max(max, sum);
        }
		System.out.println(max);
	}
}
