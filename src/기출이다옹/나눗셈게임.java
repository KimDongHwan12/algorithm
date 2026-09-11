package 기출이다옹;

import java.util.*;

public class 나눗셈게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int test = 1 ; test<=tc ; test++) {
			
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			for(int i = 0 ;  i<N ; i++) {
				arr[i] = sc.nextInt();
			}
			
			int answer = Divide(arr, N);
			
			System.out.println("#"+test+" "+answer);
		}
	}
	
	public static int Divide(int[] arr, int N) {
		
		int sum = 0;
		
		for(int i = 0; i<N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				
				if(arr[i] != arr[j]) {
					sum += arr[i] % arr[j];
				}else {
					sum += 0;
				}
			}
		}
		
		
		return sum;
	}
}
