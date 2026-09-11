package String_Stack;

import java.util.*;

public class 제로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int test = 1  ;  test<= tc ; test++) {
			int k = sc.nextInt();
			
			int[] arr = new int[k];
			
			for(int i = 0; i< k ; i++) {
				arr[i] = sc.nextInt();
			}
			
			int answer = Stack(arr);
			
			System.out.println("#"+test+" "+answer);
		}
	}
	
	public static int Stack(int[] arr) {
		
		int[] result = new int[arr.length];
		
		int top = 0;
		
		for (int i = 0; i<arr.length; i++) {
			
			if(arr[i] == 0) {
				
				if(top>0) {
					top--;
				}
			}else {
				
				result[top] = arr[i];
				top++;
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i<top; i++) {
			sum += result[i];
		}
		
		
		
		
		return sum;
	}
}


