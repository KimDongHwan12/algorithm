package Array_과제;

import java.util.*;

public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test = 0 ; test<10 ;  test++) {
			int tc = sc.nextInt();
			
			int[][] arr = new int[100][100];
			
			for(int i = 0; i<100 ; i++) {
				for(int j = 0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int answer = Calculator(arr);
			
			System.out.println("#" + tc + " "+ answer);
		}
	}
	
	//최종비교
	public static int Calculator(int[][] arr) {
		
		int[] sum_arr = {Row(arr), Col(arr), Ldiag(arr), Rdiag(arr)};
		int max = sum_arr[0];
		
		for(int i = 1; i<4; i++) {
			if(sum_arr[i]>max)
				max = sum_arr[i];
		}
		
		return max;
	}
	
	
	//행의 합
	public static int Row(int[][] arr) {
		
		int max = 0;
		for(int row = 0; row<100; row++) {
			int sum = 0;
			for(int col = 0; col<100 ; col++) {
				sum += arr[row][col];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
	
	//열의 합
	public static int Col(int[][] arr) {
		
		int max = 0;
		for(int col = 0; col<100; col++) {
			int sum = 0;
			for(int row = 0; row<100 ; row++) {
				sum += arr[row][col];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
	
	//왼쪽 대각석의 합
	public static int Ldiag(int[][] arr) {
		
		int sum = 0;
		for(int i = 0 ; i<100 ; i++) {
			sum += arr[i][i];
		}
		
		return sum;
	}
	
	//오른쪽 대각선의 합
	public static int Rdiag(int[][] arr) {
		
		int sum = 0;
		for(int i = 0 ; i<100 ; i++) {
			for(int j = 99 ; j==0 ; j--) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
}




















