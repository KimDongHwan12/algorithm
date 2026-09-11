package 기출이다옹;

import java.util.*;

public class 풍선팡보너스게임2 {
	
	static int N;
	static int[][] arr;
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	static int result;
	static int sum;
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc =1; tc<=T ; tc++) {
			 
			N = sc.nextInt();
			
			arr = new int[N][N];
			
			for(int i = 0; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			result = 0;
			
			///풍선 찾기
			for(int i = 0; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					sum = arr[i][j];
					for(int d = 0; d<4 ; d++) {
						
						int nr = i + dr[d];
						int nc = j + dc[d];
						
						while(true) {
							if(nr<0 || nr>=N || nc<0 || nc>=N) {
								break;
							}
							sum+=arr[nr][nc];
							
							nr+=dr[d];
							nc+=dc[d];
						}
					}
					result = Math.max(sum, result);
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}
