package 자리수단위로완탐;

import java.util.*;
/**
 * 
 */
public class Carry피하기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = -1;
		
		for(int i = 0; i<n-2 ; i++) {
			for(int j = i+1; j<n-1 ; j++) {
				for(int k = j+1; k<n ; k++) {
					
					if(arr[i] % 10 + arr[j] % 10 + arr[k] % 10 >= 10) {
						continue;
					}
					if(arr[i] % 100 / 10 + arr[j] % 100 /10 + arr[k] % 100 /10 >= 10) {
						continue;
					}
					if(arr[i] % 1000 / 100+ arr[j] % 1000 / 100 + arr[k] % 1000 / 100 >= 10) {
						continue;
					}
					if(arr[i] % 10000 /1000 + arr[j] % 10000 / 1000 + arr[k] % 10000 / 1000 >= 10) {
						continue;
					}
					
					int sum = arr[i] + arr[j] + arr[k];
					max = Math.max(max, sum);
				}
			}
		}
		System.out.println(max);
	}
}
