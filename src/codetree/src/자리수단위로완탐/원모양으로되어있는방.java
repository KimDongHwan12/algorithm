package 자리수단위로완탐;

import java.util.*;

public class 원모양으로되어있는방 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		
		//시작하는 방의 위치
		for(int i = 0; i<n ; i++) {
			int sum = 0;
			//n번 반복
			for(int j = 0; j<n ; j++) {
				if(i==j) {
					continue;
				}
				int distance = (j + n - i) % n;;
				sum+= distance * arr[j];
			}
			min = Math.min(min, sum);
		}
		
		System.out.println(min);
	}
}
