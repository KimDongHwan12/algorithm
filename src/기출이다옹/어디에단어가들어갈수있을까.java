package 기출이다옹;

import java.util.*;


public class 어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc =1 ; tc<=T ; tc++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i =0; i<N ; i++) {
				for(int j = 0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int result = 0;
			
			//가로 검사

			for(int i =0; i<N ; i++) {
				int count = 0;
				for(int j = 0; j<N; j++) {
					if(arr[i][j] == 0) {
						if(count == K) {
							result++;
						}
						count = 0;
					}else {
						count++;
					}
				}
				if(count == K) {
					result++;
				}
			}
			
			
			//세로 검사
			for(int i =0; i<N ; i++) {
				int count = 0;
				for(int j = 0; j<N; j++) {
					if(arr[j][i] == 0) {
						if(count == K) {
							result++;
						}
						count = 0;
					}else {
						count++;
					}
				}
				if(count == K) {
					result++;
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}
