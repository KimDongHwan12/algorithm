package String_Stack;

import java.util.*;

public class 회문1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int tc = 1; tc <= 10; tc++) {

            int num = sc.nextInt();

            char[][] arr = new char[8][8];

            for(int i = 0; i < 8; i++) {

                String str = sc.next();

                for(int j = 0; j < 8; j++) {

                    arr[i][j] = str.charAt(j);
                }
            }

            int answer = search(arr, num);

            System.out.println("#" + tc + " " + answer);
        }

        sc.close();
    }


    public static int search(char[][] arr, int num) {

        int count = 0;

        for(int i = 0; i < 8; i++) {

            for(int j = 0; j <= 8 - num; j++) {

                boolean rowPalindrome = true;
                boolean colPalindrome = true;

                for(int k = 0; k < num / 2; k++) {

                    // 가로 검사
                    if(arr[i][j + k]
                            != arr[i][j + num - 1 - k]) {

                        rowPalindrome = false;
                    }

                    // 세로 검사
                    if(arr[j + k][i]
                            != arr[j + num - 1 - k][i]) {

                        colPalindrome = false;
                    }
                }

                if(rowPalindrome) {
                    count++;
                }

                if(colPalindrome) {
                    count++;
                }
            }
        }

        return count;
    }
}