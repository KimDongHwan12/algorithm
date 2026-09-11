package Queue_LinkedList;

import java.util.*;

public class 암호문3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {

            int N = sc.nextInt();

            LinkedList<Integer> list = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                list.add(sc.nextInt());
            }

            int M = sc.nextInt();

            // 명령어 처리 메서드 호출
            command(list, M, sc);

            // 출력 메서드 호출
            printAnswer(list, tc);
        }

        sc.close();
    }


    // 명령어 전체를 처리하는 메서드
    public static void command(LinkedList<Integer> list, int M, Scanner sc) {

        for (int i = 0; i < M; i++) {

            String cmd = sc.next();

            if (cmd.equals("I")) {
                insert(list, sc);
            }

            else if (cmd.equals("D")) {
                delete(list, sc);
            }

            else if (cmd.equals("A")) {
                add(list, sc);
            }
        }
    }


    // I : 삽입
    public static void insert(LinkedList<Integer> list, Scanner sc) {

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < y; i++) {
            list.add(x + i, sc.nextInt());
        }
    }


    // D : 삭제
    public static void delete(LinkedList<Integer> list, Scanner sc) {

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < y; i++) {
            list.remove(x);
        }
    }


    // A : 뒤에 추가
    public static void add(LinkedList<Integer> list, Scanner sc) {

        int y = sc.nextInt();

        for (int i = 0; i < y; i++) {
            list.add(sc.nextInt());
        }
    }


    // 정답 출력
    public static void printAnswer(LinkedList<Integer> list, int tc) {

        System.out.print("#" + tc);

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + list.get(i));
        }

        System.out.println();
    }
}