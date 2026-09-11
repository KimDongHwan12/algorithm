package tree_heap;

import java.util.*;

public class 힙 {

    // 최대 힙을 저장할 배열
    static int[] heap;

    // 현재 힙에 들어있는 원소의 개수
    static int size;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int T = sc.nextInt();

        // 테스트 케이스 반복
        for (int tc = 1; tc <= T; tc++) {

            // 수행할 명령의 개수
            int N = sc.nextInt();

            // 힙은 1번 인덱스부터 사용하므로 N + 1 크기로 생성
            heap = new int[N + 1];

            // 처음에는 힙이 비어있음
            size = 0;

            // 테스트 케이스 번호 출력
            System.out.print("#" + tc);

            // N개의 명령 처리
            for (int i = 0; i < N; i++) {

                // 명령 번호 입력
                int command = sc.nextInt();

                // 1이면 삽입
                if (command == 1) {

                    // 삽입할 값 입력
                    int x = sc.nextInt();

                    // 최대 힙에 값 삽입
                    push(x);

                }

                // 2이면 최대값 삭제 및 출력
                else {

                    System.out.print(" " + pop());

                }

            }

            // 테스트 케이스 하나가 끝나면 줄바꿈
            System.out.println();

        }

    }


    // 최대 힙에 값을 삽입하는 메서드
    public static void push(int value) {

        // 원소가 하나 추가되므로 size 증가
        size++;

        // 새로운 값을 힙의 가장 마지막 위치에 삽입
        heap[size] = value;

        // 방금 삽입한 위치를 current로 설정
        int current = size;

        // 루트에 도착하기 전까지 부모와 비교
        while (current > 1) {

            // 현재 노드의 부모 위치
            int parent = current / 2;

            // 부모가 현재 값보다 크거나 같으면
            // 이미 최대 힙 조건을 만족하므로 종료
            if (heap[parent] >= heap[current]) {

                break;

            }

            // 부모와 현재 값을 교환
            int temp = heap[parent];

            heap[parent] = heap[current];

            heap[current] = temp;

            // 현재 위치를 부모 위치로 이동
            // 다시 위쪽 부모와 비교하기 위함
            current = parent;

        }

    }


    // 최대값을 삭제하고 반환하는 메서드
    public static int pop() {

        // 힙이 비어있으면 삭제할 값이 없으므로 -1 반환
        if (size == 0) {

            return -1;

        }

        // 최대 힙의 루트에는 항상 가장 큰 값이 있음
        // 삭제할 최대값을 미리 저장
        int result = heap[1];

        // 가장 마지막 값을 루트 자리로 이동
        heap[1] = heap[size];

        // 원소 하나를 삭제했으므로 size 감소
        size--;

        // 루트부터 다시 최대 힙을 정리
        int current = 1;

        while (true) {

            // 현재 노드의 왼쪽 자식 위치
            int left = current * 2;

            // 현재 노드의 오른쪽 자식 위치
            int right = current * 2 + 1;

            // 왼쪽 자식이 없다면
            // 더 이상 내려갈 곳이 없으므로 종료
            if (left > size) {

                break;

            }

            // 일단 왼쪽 자식이 더 크다고 가정
            int biggerChild = left;

            // 오른쪽 자식이 존재하고
            // 오른쪽 값이 왼쪽 값보다 더 크다면
            if (right <= size && heap[right] > heap[left]) {

                // 더 큰 자식을 오른쪽으로 변경
                biggerChild = right;

            }

            // 현재 값이 가장 큰 자식보다 크거나 같으면
            // 최대 힙 조건을 만족하므로 종료
            if (heap[current] >= heap[biggerChild]) {

                break;

            }

            // 현재 값과 더 큰 자식의 값을 교환
            int temp = heap[current];

            heap[current] = heap[biggerChild];

            heap[biggerChild] = temp;

            // 교환 후 아래로 내려간 위치에서 다시 검사
            current = biggerChild;

        }

        // 처음에 저장해둔 최대값 반환
        return result;
    
    }

}

