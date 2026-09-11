package String_Stack;

/**
 * 하노이의 탑을 재귀적으로 해결하는 예제이다.
 *
 * n개의 원판을 출발 기둥에서 도착 기둥으로 옮기는 과정
 *
 * 1. 위쪽 n-1개를 출발 기둥에서 보조 기둥으로 옮긴다.
 * 2. 가장 큰 n번 원판을 출발 기둥에서 도착 기둥으로 옮긴다.
 * 3. 보조 기둥의 n-1개를 도착 기둥으로 옮긴다.
 *
 * 이동 횟수는 2^N - 1이며 시간 복잡도는 O(2^N)이다.
 * 재귀 호출의 최대 깊이는 N이므로 호출 스택 공간은 O(N)이다.
 */


/**
 * public static void hello(int n){
 * 	
 * 	if ( n == 0){
 * 		return;
 * 	  }
 * 
 * 	print 블라블라;
 * 
 * 	hello(n-1)
 * }
 */
public class Stack08_하노이탑 {

    static int moveCount;

    public static void main(String[] args) {

        int N = 3;

        hanoi(N, 'A', 'B', 'C');

        System.out.println("총 이동 횟수: " + moveCount);
    }

    /**
     * @param n    옮겨야 할 원판 수
     * @param from 출발 기둥
     * @param via  보조 기둥
     * @param to   도착 기둥
     */
    public static void hanoi(int n, char from, char via, char to) {

        if (n == 0) {
            return;
        }

        hanoi(n - 1, from, to, via);
        
        moveCount++;
        
        System.out.println(n + "번 원판 이동");

        hanoi(n - 1, via, from, to);
    }
}