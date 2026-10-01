package 자리수단위로완탐;

import java.util.*;
//격자 위에서의 가장 좋은 위치
public class _1x3안의최대동전수 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<n ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int answer = 0;
		//2차원배열에서 시작위치 잡아주기
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<n-2 ; j++) {
				int count = arr[i][j] + arr[i][j+1] + arr[i][j+2];
				answer = Math.max(answer, count);
			}
		}
		System.out.println(answer);
	}
}	
