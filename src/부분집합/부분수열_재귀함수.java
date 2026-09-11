package 부분집합;

import java.util.*;

public class 부분수열_재귀함수 {
	
	static int N;
	static int K;
	
	static int[] arr;
	static int answer;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for(int tc = 1; tc<=T; tc++) {
        	
        	N = sc.nextInt();
        	K = sc.nextInt();
        	
        	for(int i = 0; i<N ; i++) {
        		arr[i] = sc.nextInt();
        	}
        	
        	answer = 0;
        	
        	sequence(0, 0);
        	
        	System.out.println("#" + tc + " " + answer);
        }
    }
    public static void sequence(int index, int sum) {

        if (index == N) {

            if (sum == K) {
                answer++;
            }

            return;
        }

        // 현재 숫자를 선택하는 경우
        sequence(index + 1, sum + arr[index]);

        // 현재 숫자를 선택하지 않는 경우
        sequence(index + 1, sum);
    }
}
