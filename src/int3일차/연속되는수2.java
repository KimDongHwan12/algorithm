package int3일차;

import java.util.*;

public class 연속되는수2 {
	
	static int n;
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int count = 0;
		int result = 0;
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	
		
		for(int i = 0; i<n; i++) {
			if(i == 0 || arr[i] == arr[i-1]) {
				count++;
			}else {
				count = 1;
			}
			
			result = Math.max(result, count);
		}
		
		System.out.println(result);
	}
}
