package 순열_조합;

import java.util.*;

public class 최적경로 {
	
	static int N;
	
	static int companyX;
	static int companyY;
	
	static int homeX;
	static int homeY;
	
	static int[][] customer;
	
	static boolean[] visited;
	
	static int[] order;
	static int answer;
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            N = sc.nextInt();

            companyX = sc.nextInt();
            companyY = sc.nextInt();

            homeX = sc.nextInt();
            homeY = sc.nextInt();

            customer = new int[N][2];

            for (int i = 0; i < N; i++) {
                customer[i][0] = sc.nextInt();
                customer[i][1] = sc.nextInt();
            }

            order = new int[N];
            
            visited = new boolean[N];

            answer = Integer.MAX_VALUE;
            
            permutation(0);
            

            System.out.println("#" + tc + " " + answer);
        }
    }
	static void permutation(int depth) {

	        if (depth == N) {

	            calculate();

	            return;
	        }


	        for (int i = 0; i < N; i++) {

	            if (visited[i]) {
	                continue;
	            }

	            visited[i] = true;

	            order[depth] = i;

	            permutation(depth + 1);

	            visited[i] = false;
	        }
	}
	 
		 
	static void calculate() {

		        int sum = 0;

		        int currentX = companyX;
		        int currentY = companyY;


		        for (int i = 0; i < N; i++) {

		            int customerNum = order[i];

		            int nextX = customer[customerNum][0];
		            int nextY = customer[customerNum][1];

		            int distance =
		                    Math.abs(currentX - nextX)
		                    + Math.abs(currentY - nextY);

		            sum += distance;

		            currentX = nextX;
		            currentY = nextY;
		        }


		        int home =
		                Math.abs(currentX - homeX)
		                + Math.abs(currentY - homeY);

		        sum += home;


		        answer = Math.min(answer, sum);
		 
	}
	
}
