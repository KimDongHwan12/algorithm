package tree_heap;

import java.util.*;

public class 사칙연산 {

    static String[] value; // 정점에 들어있는 숫자 or 연산자를 저장하는 배열
    static int[] left, right; // 그 정점의 왼쪽, 오른쪽 자식 노드

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {

            int N = sc.nextInt();
            //0번 인덱스는 사용하지 않기 때문에 +1로 크기를 설정
            value = new String[N + 1];
            left = new int[N + 1];
            right = new int[N + 1];

            for (int i = 0; i < N; i++) {

                int node = sc.nextInt();
                value[node] = sc.next();

                // 정점 값의 첫 글자가 숫자인지 확인
                if (!Character.isDigit(value[node].charAt(0))) {
                    left[node] = sc.nextInt();
                    right[node] = sc.nextInt();
                }
            }

            System.out.println("#" + tc + " " + (int)calc(1));
        }
    }

    //나눗셈 결과가 소수가 될 수도 있음
    static double calc(int node) {

        // 숫자면 바로 반환
        if (Character.isDigit(value[node].charAt(0))) {
            return Double.parseDouble(value[node]);
        }

        // 왼쪽, 오른쪽 계산
        double a = calc(left[node]);
        double b = calc(right[node]);

        switch (value[node]) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            default:  return a / b;
        }
    }
}
