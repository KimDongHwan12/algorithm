package 기출이다옹;

import java.util.*;

public class 일회용품_막버리지마 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int test = 1 ;  test<=tc ; test++) {
			
			int N = sc.nextInt();
			int K_min = sc.nextInt();
			int K_max = sc.nextInt();
			
			int[] person = new int[N];
			
			for(int i = 0; i<N ;  i++) {
				person[i] = sc.nextInt();
			}
			
			int answer = 분반테스트(person, N, K_min, K_max);
			
			System.out.println("#"+test+" "+answer);
		}
	}
	
	public static int 분반테스트(int[] person, int N, int k_min, int k_max) {
		
		int[] grade = new int[3];
		
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			sum += person[i];
		}
	
		
		int mean = (int) Math.round((double) sum / N);
		
		System.out.println(mean);
		for(int i = 0; i<N; i++) {
			if(person[i] == mean) {
				grade[1]++;
			}else if(person[i]>mean) {
				grade[2]++;
			}else {
				grade[0]++;
			}
		}
		
		int a = Math.max(grade[0], Math.max(grade[1], grade[2]));
		int b = Math.min(grade[0], Math.max(grade[1], grade[2]));
		
		if((grade[0]>=k_min && grade[0]<=k_max)&&(grade[1]>=k_min & grade[1]<=k_max)
				&&(grade[2]>=k_min & grade[2]<=k_max)) {
			return a-b;
		}
		
		return -1;
	}
}
