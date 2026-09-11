package im대비;

import java.util.*;
/**
 * 괴물의 위치에서 4방향 탐색하면서 0인 부분을 다른 임의의 숫자로 변경한다.
 * 
 * 조건은 배열의 길이를 벗어나거나 1이라는 값이 들어있으면 멈추고 델타 방향을 바꾼다.
 * 
 * 괴물의 위치에서 빔을 쏴야하므로 반드시 한 방향 탐색 후 다시 괴물 위치로 돌아와야한다.
 */
public class 우주괴물 {
	
	static int T;
	
	static int N;
	static int[][] arr;
	static int[] dr = {-1, 1, 0 , 0};
	static int[] dc = {0, 0, -1, 1};
	
	static int monster_x, monster_y;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int tc= 1; tc<=T ; tc++) {
			
			N = sc.nextInt();
			arr = new int[N][N];
			
			for(int i = 0; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j] == 2) {
						monster_x =i;
						monster_y =j;
					}
				}
			}
			
			for(int dir = 0 ; dir<4 ; dir++) {
				
				int nr = monster_x;
				int nc = monster_y;
				
				while(true) {
					
					nr+=dr[dir];
					nc+=dc[dir];
					
					if(nr<0 || nr>=N || nc<0 || nc>=N) {
						break;
					}
					if(arr[nr][nc] == 1) {
						break;
					}
					
					 if (arr[nr][nc] == 0) {
	                        arr[nr][nc] = 3;
					 }
				}
			}
			
			int result = 0;
			for(int i = 0; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					if(arr[i][j] == 0) {
						result++;
					}
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}
