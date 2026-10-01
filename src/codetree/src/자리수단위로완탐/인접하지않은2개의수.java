package 자리수단위로완탐;

import java.util.*;

public class 인접하지않은2개의수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = Integer.MIN_VALUE;
		
		for(int i = 0; i<n-2; i++) {
			for(int j = i+2; j<n; j++) {
				int sum = arr[i] + arr[j];
				answer = Math.max(answer, sum);
			}
		}
		System.out.println(answer);
	}
}
