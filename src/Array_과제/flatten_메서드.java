package Array_과제;

import java.util.*;

public class flatten_메서드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc<=10 ; tc++) {
			int sort = sc.nextInt();
			
			int[] arr = new int[100];
			
			for(int i = 0; i<100 ; i++) {
				arr[i] = sc.nextInt();
			}
			
			int answer = Dump(arr, sort);
			
			System.out.println("#"+tc+" "+ answer);
		}
	}
	
	public static int Dump(int[] arr, int sort) {
		
		for(int i = 0; i<sort ; i++) {
			
			Arrays.sort(arr);
			
			if(arr[99] - arr[0] == 1) {
				break;
			}
			
			arr[99]--;
			
			arr[0]++;
		}
		Arrays.sort(arr);
		
		
		return arr[99] - arr[0];
	}
}
