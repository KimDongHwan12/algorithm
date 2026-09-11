package im대비;

import java.util.*;
/**
 * 특정 길이의 문자열이 주어지면 인덱스로 비교를 위해 문자배열 형태로 변경
 * 
 * 생각해야 할 것
 * 
 * 주어진 길이만큼 비교를 하기 위해 시작할 수 있는 시작인덱스의 개수
 * 인덱스 비교를 하기 위해 얼마나 들어가야하는지!!!!
 * 
 */
public class 회문찾기1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
    		
    	int T = sc.nextInt();
    	
    	for(int tc =1; tc<=T ; tc++) {
    		
    		int N =sc.nextInt();
    		int M = sc.nextInt();
    		String str = sc.next();
    		char[] chr = str.toCharArray();
    		
    		boolean end = false;
    		
    		for(int i = 0; i<=N-M; i++) {
    			boolean bool = true;
    			for(int x = 0; x<M/2; x++) {
    				if(chr[i+x] != chr[M-1-x+i]) {
    					bool = false;
    					break;
    				}
    			}
    			if(bool) {
    				System.out.println("#"+tc+" "+str.substring(i, i+M));
    				end = true;
    				break;
    			}
    		}
    		if(!end) {
    			System.out.println("#"+tc+" "+"NONE");
    		}
    	}
    }
}	






