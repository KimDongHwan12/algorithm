package String_Stack;

import java.util.*;

public class 괄호_짝짓기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc<=10; tc++) {
			
			int len = sc.nextInt();
			
			String parentheses = sc.next();
			
			int answer = Palindrome(parentheses, len);
			
			System.out.println("#"+tc+" "+answer);
		}
	}
	
	public static int Palindrome(String parentheses, int len) {
		
		 Stack<Character> stack = new Stack<>();

	        for(int i = 0; i < len; i++) {

	            char ch = parentheses.charAt(i);

	            if(ch == '(' || ch == '[' || ch == '{' || ch == '<') {

	                stack.push(ch);
	            }

	            else {

	                if(stack.isEmpty()) {
	                    return 0;
	                }

	                char open = stack.pop();

	                if(ch == ')' && open != '(') {
	                    return 0;
	                }

	                if(ch == ']' && open != '[') {
	                    return 0;
	                }

	                if(ch == '}' && open != '{') {
	                    return 0;
	                }

	                if(ch == '>' && open != '<') {
	                    return 0;
	                }
	            }
	        }

	        if(stack.isEmpty()) {
	            return 1;
	        }

	        return 0;
	    }
}
