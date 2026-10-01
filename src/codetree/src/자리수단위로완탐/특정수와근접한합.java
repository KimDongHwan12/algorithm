package 자리수단위로완탐;
import java.util.*;

public class 특정수와근접한합 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int[] arr = new int[n];
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i = 0; i<n ; i++) {
        	arr[i] = sc.nextInt();
        	sum += arr[i];
        }
        
        
        
        for(int i = 0; i<n ; i++) {
        	for(int j = i+1; j<n ; j++) {
                int newSum = sum - (arr[i] + arr[j]);

                int diff = Math.abs(newSum - s);
                min = Math.min(min, diff); 
        	}
        }
        
        System.out.println(min);
	}
}
