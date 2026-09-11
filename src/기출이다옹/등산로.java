package 기출이다옹;

import java.util.*;

public class 등산로 {
	
	static int N;
	static int[][] arr;
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	static int[][] visit;
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc =1; tc<=T; tc++) {
			
			N = sc.nextInt();
			
			arr = new int[N][N];
			visit = new int[N][N];
			
			for(int i = 0; i<N ; i++) {
				for(int j =0; j<N ;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int result = 0;
			
			for(int i = 0; i<N ; i++) {
				for(int j =0; j<N ;j++) {
					int count =0;
					int min = Integer.MAX_VALUE;
					
					for(int d = 0; d<4 ; d++) {
						
						int nr = i + dr[d];
						int nc = j + dc[d];
						
						int c = arr[nr][nc];
						
						if(arr[i][j]<c) {
							
							
						}
					}
				}
			}
		}
	}
}
