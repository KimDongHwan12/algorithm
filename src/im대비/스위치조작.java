package im대비;

import java.util.*;
/**
 * 케이스를 보면 규칙이 보인다.
 * 
 */

public class 스위치조작 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc =1; tc<=T ; tc++) {
			int N = sc.nextInt();
			int[] start = new int[N];
			int[] end = new int[N];
			
			for(int i = 0; i<N ; i++) {
				start[i]=sc.nextInt();
			}
			for(int i = 0; i<N ; i++) {
				end[i]=sc.nextInt();
			}
			
			int count = 0;
			
			
			for(int j = 0; j<N ; j++) {
				if(start[j] != end[j]) {
					for(int x= j ; x<N ; x++) {
						if(start[x] == 0) {
							start[x]= 1;
						}else {
							start[x] =0;
						}
					}
					count++;
				}
			}
			System.out.printf("#%d %d",tc,count);
			System.out.println();
		}
	}
}
