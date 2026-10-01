package 자리수단위로완탐;

import java.util.*;

public class 괄호쌍만들어주기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] chr = str.toCharArray();
		
		int answer = 0;
		
		//열린괄호 시작 탐색
		for(int i = 0; i<chr.length-1; i++) {
			//닫힌괄호 탐색
			for(int j = i+2; j<chr.length-1; j++) {
				if(chr[i]=='(' && chr[i+1] =='(' && chr[j] ==')'&&chr[j+1]==')') {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
