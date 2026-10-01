package 구간단위로완전탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 아름다운수열2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] temp = new int[m];
        
        for (int i = 0; i < n; i++) {
        	arr1[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i < m; i++) {
        	arr2[i] = sc.nextInt();
        }
        
        Arrays.sort(arr2);
        
        int answer = 0;
        
        for (int i = 0; i <= n-m; i++) {
        	boolean same = true;
        	for (int j = 0; j < m; j++) {
        		temp[j] = arr1[j+i];
            }
        	
        	Arrays.sort(temp);
        	
        	for (int j = 0; j < m; j++) {
        		if(temp[j]!=arr2[j]) {
        			same = false;
        		}
            }
        	if(same) {
        		answer++;
        	}
        }
        System.out.println(answer);
        
    }
}

