package im대비;

import java.util.*;
/**전역으로 설정한 함수여도 반드시 초기화는 시켜줄것!!!
 * 
 * 8차원 델타 문제
 * 8차원 델타 탐색을 통해 2차원 배열의 모든 인덱스를 이동하면서
 * 탐색 후 조건에 맞는 인덱스를 찾으면 카운트를 늘린다.
 * 조건에 맞는 구역의 갯수를 뽑는 문제
 */
public class 우주선착륙2 {
	
	static int N;
	static int M;
	
	static int[][] arr;
	
	static int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dc = {-1,  0,  1,-1, 1,-1, 0, 1};
	
	static int result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1 ; tc<=T ; tc++) {
			
			N = sc.nextInt();
			M = sc.nextInt();
			result = 0;
			arr = new int[N][M];
			
			for(int i = 0; i<N ; i++) {
				for(int j = 0; j<M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			Solution();
			
			System.out.println("#"+tc+" "+result);
		}
	}
	
	public static int Solution() {
		
		for(int i = 0; i<N ; i++) {
			for(int j = 0; j<M; j++) {
				int count = 0;
				for(int d = 0; d<8 ; d++) {
					int nr = i + dr[d];
					int nc = j + dc[d];
					
					if(nr<0 || nr>=N || nc<0 || nc>=M) {
						continue;
					}
					
					if(arr[i][j] > arr[nr][nc]) {
						count++;
					}
				}
				if(count >=4) {
					result+=1;
				}
			}
		}
		return result;
	}
}
