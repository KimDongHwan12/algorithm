package sweaa;
import java.util.*;
/**
 * 조건 
 * 
 * 8x8크기의 2차원배열
 * 각 칸에는 A, B, C 중 하나만 들어간다.
 * 해당 위치에서 가로 세로만 탐색
 * 총 10개의 TEST CASE
 * 회문의 길이가 주어짐
 * 
 * 출력 형태
 * 
 * 주어진 회문의 길이와 일치하는 회문의 갯수를 출력
 * 
 */
public class 회문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc =1 ; tc<=10 ; tc++) {
			int length = sc.nextInt();
			
			char [][] arr = new char[8][8];
			
			for(int i = 0 ; i<8 ; i++) {
				String str = sc.next();
				for(int j =0; j<8 ; j++) {
					arr[i][j]  = str.charAt(j);
				}
			}

			//정답을 담을 변수 설정
			int count = 0;
			
			//가로 찾기
			for(int i =0; i<8 ; i++) {
				for(int j = 0; j<=8-length ; j++) {
					
					boolean palindrome = true;
					
					for(int k = 0 ; k< length /2 ; k++) {
						
						if(arr[i][j+k] != arr[i][j+length-1-k]) {
							palindrome = false;
							break;
						}
					}
					if(palindrome) {
						count++;
					}
						
				}
			}
			
			//세로찾기
			for(int j =0; j<8 ; j++) {
				for(int i = 0; i<=8-length ; i++) {
					
					boolean palindrome = true;
					
					for(int k = 0 ; k<=length /2 ; k++) {
						
						if(arr[i+k][j] != arr[i+length-1-k][j]) {
							palindrome = false;
							break;
						}
					}
					if(palindrome) {
						count++;
					}
						
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}
