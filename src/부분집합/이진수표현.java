package 부분집합;

import java.util.*;

public class 이진수표현 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int test = 1; test<=tc ; test++) {
			
			int case_one = sc.nextInt();
			int case_two = sc.nextInt();
			
			String answer = Solution(case_one, case_two);
			
			System.out.println("#"+test+" "+answer);
		}
	}
	
	 public static String Solution(int N, int M) {

	        int mask = (1 << N) - 1;

	        if ((M & mask) == mask) {
	            return "ON";
	        }

	        return "OFF";
	    }
}
