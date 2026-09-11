package String_Stack;

import java.util.*;

public class String_swea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int test = 0; test < 10; test++) {

            int tc = sc.nextInt();

            String str1 = sc.next();
            String str2 = sc.next();

            int answer = search(str1, str2);

            System.out.println("#" + tc + " " + answer);
        }
    }


    public static int search(String str1, String str2) {

        int count = 0;

        for(int i = 0; i <= str2.length() - str1.length(); i++) {

            boolean find = true;

            for(int j = 0; j < str1.length(); j++) {

                if(str2.charAt(i + j) != str1.charAt(j)) {
                    find = false;
                    break;
                }
            }

            if(find) {
                count++;
            }
        }

        return count;
    }
}