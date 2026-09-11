package Array_과제;
import java.util.*;

public class 파리퇴치_메서드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int test = 1; test<=tc ; test++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i = 0 ; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int answer = solution(arr, N, M);
			
			System.out.println("#"+test+" "+answer);
		}
	}
	
	public static int solution(int arr[][], int n, int m) {
		
		int result = 0;
		
		for(int i  = 0; i<= n-m ; i++) {
			for(int j = 0; j<=n-m ; j++) {
				
				int getsum = sum(arr, i, j, m);
				
				result = Math.max(result, getsum);
			}
		}
		
		return result;
	}
	
	public static int sum(int arr[][], int i, int j, int m) {
		int sum = 0;
		
		for(int row = i ; row< i+m ; row++) {
			for(int col = j ; col < j+m ; col++) {
				
				sum += arr[row][col];
			}
		}
		
		return sum;
	}
}
