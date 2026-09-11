package im대비;

import java.util.*;
/**중요하게 생각할 것
 * 1. 반복문의 시작 범위를 늘 고민해라
 * 2. Math.max 사용의 경우 값을 덮어 쓰고 있는지 생각
 * 3. 조건문의 경우 코드가 길어져도 나누는게 좋다
 * 4. &&과 ||를 잘 구분하자
 * 
 * 
 * 이번 문제는 8차원 델타를 십자와 x로 나누어 계산후 비교하는 문제이다.
 */
public class 파리퇴치3 {
	
	static int N;
	static int M;
	
	static int[][] arr;
	static int result;
	
	static int[] dr= {-1, 1, 0 ,0};
	static int[] dc = {0, 0, -1, 1};
	
	static int[] dr2 = {-1, -1, 1, 1};
	static int[] dc2 = {-1, 1, -1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc =1 ; tc<=T ; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			result = 0;
			
			arr = new int[N][N];
			
			for(int i =0 ; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			Solution();
			
			System.out.println("#"+tc+" "+result);
		}
	}
	
	public static void Solution() {
		
		for(int i =0 ; i<N ; i++) {
			for(int j = 0; j<N ; j++) {
				int sum1=arr[i][j];
				int sum2=arr[i][j];
				
				for(int d=0; d<4 ; d++) {
					for(int k = 1; k<M; k++) {
						
						int nr = i+dr[d]*k;
						int nc = j+dc[d]*k;
						int nr2 = i+dr2[d]*k;
						int nc2 = j+dc2[d]*k;
						
						if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
						    sum1 += arr[nr][nc];
						}

						if(nr2 >= 0 && nr2 < N && nc2 >= 0 && nc2 < N) {
						    sum2 += arr[nr2][nc2];
						}
					}
				}
				
				result = Math.max(result, Math.max(sum1, sum2));
			}
		}
	}
}
