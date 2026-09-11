package Queue_LinkedList;

import java.util.*;

public class 암호생성기{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {

            int tc = sc.nextInt();

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < 8; i++) {
                queue.offer(sc.nextInt());
            }

            makePassword(queue);

            System.out.print("#" + tc + " ");

            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }

            System.out.println();
        }
    }

    public static void makePassword(Queue<Integer> queue) {

        int minus = 1;

        while (true) {

            int num = queue.poll();

            num = num - minus;

            if (num <= 0) {
                queue.offer(0);
                break;
            }

            queue.offer(num);

            minus++;

            if (minus == 6) {
                minus = 1;
            }
        }
    }
}
