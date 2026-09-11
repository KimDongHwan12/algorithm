package 기출이다옹;

import java.util.*;

public class 단어는어디에 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1 ; tc<=T ; tc++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i = 0; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int answer = 찾아줘잉(arr, K);
			
			System.out.println("#"+tc+" "+answer);
		}	
	}
	
	public static int 찾아줘잉(int[][] arr,  int word) {
		
		int result = 0;
		
		for(int i = 0 ; i<arr.length; i++) {
			int count = 0 ;
			for(int j = 0; j<arr.length ; j++) {
				if(arr[i][j] == 1) {
					count++;
				}else {
					if(count == word) {
						result++;
					}
					count = 0;
				}
			}
			if(count == word) {
				result++;
			}
		}
		
		for(int i = 0 ; i<arr.length; i++) {
			int count = 0 ;
			for(int j = 0; j<arr.length ; j++) {
				if(arr[j][i] == 1) {
					count++;
				}else {
					if(count == word) {
						result++;
					}
					count = 0;
				}
			}
			if(count == word) {
				result++;
			}
		}
		
		
		
		return result;
	}
}
