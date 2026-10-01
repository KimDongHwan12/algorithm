package 자리수단위로완탐;

import java.util.*;
/**
 * 입력받을 것
 * n, m char 2차원 배열
 * 
 * 구해야하는것
 * LEE가 2차원 배열에서 8방향에서 몇번 나오는가?
 * 
 */
public class 숨은단어찾기2 {
	
	static int[] dr = {-1,1,0,0,-1,-1,1,1};
	static int[] dc = {0,0,-1,1,-1,1,-1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] arr = new char[n][m];
		
		for(int i = 0; i < n; i++) {

		    String str = sc.next();

		    for(int j = 0; j < m; j++) {
		        arr[i][j] = str.charAt(j);
		    }
		}
		
		
		int answer = 0;
		
		//탐색 시작 위치
		for(int i = 0; i <n ; i++) {
			for(int j = 0; j <m ; j++) {
				//현재 위치가 L이라면
				if(arr[i][j] == 'L') {
					//8방향 탐색
					for(int d = 0; d<8 ; d++) {
						int count = 0;
						//EE찾기
						for(int k = 1; k<=2; k++) {
							
							int nr = i+dr[d]*k;
							int nc = j+dc[d]*k;
							
							if(nr<0|| nr>=n || nc<0|| nc>=m) break;
							
							if(arr[nr][nc] != 'E') {
								break;
							}
							count++;
						}
						if(count == 2) {
							answer++;
						}
					}
				}
			}
		}
		System.out.println(answer);
	}
}
