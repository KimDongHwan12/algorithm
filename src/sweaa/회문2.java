package sweaa;
import java.util.*;
/**주어진 조건
 * 
 * 100x100 크기의 2차원 배열
 * 
 * 가장 킨 회문의 길이를 구하는 문제
 * 
 * 
 */
public class 회문2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // 테스트 케이스는 10개
	        for (int t = 0; t < 10; t++) {

	            int tc = sc.nextInt();

	            char[][] arr = new char[100][100];

	            // 100 x 100 글자판 입력
	            for (int i = 0; i < 100; i++) {

	                String str = sc.next();

	                for (int j = 0; j < 100; j++) {
	                    arr[i][j] = str.charAt(j);
	                }
	            }

	            // 가장 긴 회문의 길이를 저장
	            int answer = 1;

	            // 긴 길이부터 확인
	            for (int length = 100; length >= 1; length--) {

	                boolean found = false;

	                // ------------------
	                // 가로 회문 찾기
	                // ------------------
	                for (int i = 0; i < 100; i++) {

	                    for (int j = 0; j <= 100 - length; j++) {

	                        boolean palindrome = true;

	                        for (int k = 0; k < length / 2; k++) {

	                            if (arr[i][j + k]
	                                    != arr[i][j + length - 1 - k]) {

	                                palindrome = false;
	                                break;
	                            }
	                        }

	                        if (palindrome) {
	                            found = true;
	                            break;
	                        }
	                    }

	                    if (found) {
	                        break;
	                    }
	                }

	                // ------------------
	                // 가로에서 못 찾았다면 세로 찾기
	                // ------------------
	                if (!found) {

	                    for (int j = 0; j < 100; j++) {

	                        for (int i = 0; i <= 100 - length; i++) {

	                            boolean palindrome = true;

	                            for (int k = 0; k < length / 2; k++) {

	                                if (arr[i + k][j]
	                                        != arr[i + length - 1 - k][j]) {

	                                    palindrome = false;
	                                    break;
	                                }
	                            }

	                            if (palindrome) {
	                                found = true;
	                                break;
	                            }
	                        }

	                        if (found) {
	                            break;
	                        }
	                    }
	                }

	                // 현재 길이에서 회문을 찾았다면
	                // 가장 긴 회문이므로 정답
	                if (found) {
	                    answer = length;
	                    break;
	                }
	            }

	            System.out.println("#" + tc + " " + answer);
	        }

	        sc.close();
		
	}
}
