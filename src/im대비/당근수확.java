package im대비;

import java.util.*;

/**
 * n개의 1차원 배열 구역으로 설정되어있음
 * 1번 일꾼은 1~i까지 2번 일꾼은 i+1~n까지
 * 그래서 가장 작은 차이를 구하는 문제
 * 
 * 생각할 것
 * 
 * 1차원 배열에 칸막이마다 계산하여 최솟값을 찾는다!!!!
 * 
 */

public class 당근수확 {
	
	static int N;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T ; tc++) {
			
			N = sc.nextInt();
			arr = new int[N];
			
			for(int i = 0 ; i<N ; i++) {
				arr[i] = sc.nextInt();
			}
			
			int start = 0;
			int result2 = Integer.MAX_VALUE;
			int result1 = 0;
			
			while(start<N-1) {
				
				int sum1 = 0;
				int sum2 =0;
				
				for(int i = 0; i<=start ; i++) {
					sum1+=arr[i];
				}
				for(int j = start+1; j<N ; j++) {
					sum2+=arr[j];
				}
				
				if(result2>Math.abs(sum1-sum2)) {
					result2 = Math.abs(sum1-sum2);
					result1 = start+1;
				}
				
				start++;
				
			}
	
			System.out.println("#"+tc+" "+result1+" "+result2);	
				
		}
	}
}
