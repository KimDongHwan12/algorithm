package 기출이다옹;

import java.util.*;
/**
 * 2차원 배열의 맵이 주어짐
 * 
 * 십자, 엑스로 가능
 * 
 */
public class 폭탄마 {
	
	static int[]  dr1 = {-1, 1, 0 , 0};
	static int[] dc1 = {0, 0, -1, 1};
	
	static int[] dr2 = {-1 ,1 ,-1 , 1};
	static int[] dc2 = {-1 , 1, 1 ,-1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int test = 1 ;  test<=tc ; test++) {
			
			int N = sc.nextInt();
			int P = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i = 0 ; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int answer = Bomb(arr, P);
			
			System.out.println("#"+test+" "+answer);
		}
	}
	
	public static int Bomb(int[][] arr, int power) {

	    int happy = 0;
	    
	    
	    for (int r = 0; r < arr.length; r++) {

	        for (int c = 0; c < arr.length; c++) {

	            int plus_sum = arr[r][c];
	            int x_sum = arr[r][c];

	            //십자 탐색
	            for (int d = 0; d < 4; d++) {

	                for (int k = 1; k <= power; k++) {

	                    int nr = r + dr1[d] * k;
	                    int nc = c + dc1[d] * k;

	                    if (nr < 0 || nr >= arr.length ||
	                        nc < 0 || nc >= arr.length) {

	                        break;
	                    }

	                    plus_sum += arr[nr][nc];
	                }
	            }


	            for (int d = 0; d < 4; d++) {

	                for (int k = 1; k <= power; k++) {
	                    int nr = r + dr2[d] * k;
	                    int nc = c + dc2[d] * k;

	                    if (nr < 0 || nr >= arr.length ||
	                        nc < 0 || nc >= arr.length) {

	                        break;
	                    }

	                    x_sum += arr[nr][nc];
	                }
	            }

	            int currentMax = Math.max(plus_sum, x_sum);

	            happy = Math.max(happy, currentMax);
	        }
	    }

	    return happy;
	}
}
