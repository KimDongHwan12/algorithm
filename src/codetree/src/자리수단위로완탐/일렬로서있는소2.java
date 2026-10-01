package 자리수단위로완탐;

import java.util.*;
//세 자리수로 완전탐색
public class 일렬로서있는소2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n-2 ; i++) {
			for(int j = i+1; j<n-1; j++) {
				for(int k = j+1; k<n; k++) {
					
					if(arr[i]<=arr[j] && arr[j]<=arr[k]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
