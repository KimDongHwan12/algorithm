package 기출이다옹;

import java.util.*;

public class 두개의숫자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T ; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N];
			int[] arr2 = new int[M];
			
			for(int i = 0; i<N ;  i++) {
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i<M ;  i++) {
				arr2[i] = sc.nextInt();
			}
			
			int max = 0;
			
			if(arr.length >= arr2.length) {
				for(int i = 0; i<=N-M ; i++) {
					int cal = 0;
					for(int j = 0; j<M ; j++) {
						cal += arr[i+j] * arr2[j];
					}
					max = Math.max(max, cal);
				}
			}else {
				for(int i = 0; i<=M-N ; i++) {
					int cal = 0;
					for(int j = 0; j<N ; j++) {
						cal += arr2[i+j] * arr[j];
					}
					max = Math.max(max, cal);
				}
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}
