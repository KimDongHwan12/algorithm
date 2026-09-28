package int4일차;

import java.util.*;

public class 만나는그순간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[m+1];
        int[] target = new int[n+1];
        
        for(int i = 1; i<=m ; i++) {
        	arr[i] = sc.nextInt();
        }
        
        
        int result = -1;
        for(int i = 1; i<=m ; i++) {
        	int count = arr[i];
        	
        	target[count]++;
        	
        	if(target[count] == k) {
        		result = count;
        		break;
        	}
        }
        System.out.println(result);
    }
}