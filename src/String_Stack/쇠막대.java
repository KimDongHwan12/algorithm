package String_Stack;

import java.util.*;

public class 쇠막대 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++) {

            String str = sc.next();

            int answer = solution(str);

            System.out.println("#" + tc + " " + answer);
        }
    }

    public static int solution(String str) {

        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == '(') {

                stack.push(ch);
            }

            else {

                stack.pop();

                if(str.charAt(i - 1) == '(') {

                    answer += stack.size();
                }

                else {

                    answer++;
                }
            }
        }

        return answer;
    }
}