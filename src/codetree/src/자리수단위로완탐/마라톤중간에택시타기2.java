package 자리수단위로완탐;

import java.util.*;

public class 마라톤중간에택시타기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] x = new int[n];
        int[] y = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
		
        int min = Integer.MAX_VALUE;
        //건너뛸 위치
        for (int i = 1; i < n-1; i++) {
        	 int curr = 0;
        	 int distance = 0;
        	//건너뛴 곳을 빼고 계산
        	for(int j = 1; j<n; j++) {
        		if(i == j) {
        			continue;
        		}
        		distance += Math.abs(x[curr] - x[j]) + Math.abs(y[curr] - y[j]);
        		curr = j;
        		
        	}
        	min = Math.min(distance, min);
        }
		System.out.println(min);
        
	}
}
