package 자리수단위로완탐;

import java.util.*;

public class 씨오더을유2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		char[] chr = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i<n-2; i++) {
			for(int j = i+1; j<n-1; j++) {
				for(int k = j+1; k<n ; k++) {
					if(chr[i] == 'C' && chr[j] == 'O' && chr[k] == 'W') {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
