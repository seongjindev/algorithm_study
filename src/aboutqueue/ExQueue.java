package aboutqueue;

import java.util.*;

public class ExQueue {
    public static void main(String[] args) {
        //큐의 특징 - First In First Out(선입선출)
        //너비 우선 탐색에서 사용
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); //값넣기
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek()); //첫번째 값 확인
        System.out.println(queue.poll()); //첫번째 값 반환
        System.out.println(queue.peek());
        queue.remove(); //첫번째 값 제거
        queue.size(); //크기 확인

        //우선순위가 낮은 숫자 순(낮은 숫자 순서)
        PriorityQueue<Integer> loQue = new PriorityQueue<>();
        loQue.offer(100);
        loQue.offer(300);
        loQue.offer(10);
        System.out.println(loQue.peek()); //가장 낮은 숫자 확인


        //우선순위가 높은 숫자 순(높은 숫자 순서)
        PriorityQueue<Integer> hiQue = new PriorityQueue<>(Collections.reverseOrder());
        hiQue.offer(100);
        hiQue.offer(300);
        hiQue.offer(10);
        System.out.println(hiQue.peek()); //가장 높은 숫자 확인

        //큐와 스택을 둘다 사용할 수 있다
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(3);
        deque.offer(2);
        deque.offer(4);
        deque.offer(5);
        System.out.println(deque.peekLast()); //stack
        System.out.println(deque.peekFirst()); //queue
        System.out.println(deque.pollLast()); //stack
        System.out.println(deque.peekFirst()); //queue



    }
}
