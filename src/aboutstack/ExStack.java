package aboutstack;

import java.util.Stack;

public class ExStack {
    public static void main(String[] args){
        //스택의 특징 - Last In Fast Out
        //그래프의 깊이 수선 탐색(DFS)에서 사용
        //재귀적 함수 호출 일 때 사용
        //간단하게 crtl+z 이다
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(2); //두개의 차이점은 반환값이다, add는 항상 true를 반환하고 push는 object를 반환한다
        System.out.println(stack.peek()); // 2 - 값을 확인할 때
        System.out.println(stack.pop()); // 2 - 값을 빼 낼 때
        System.out.println(stack.peek()); // 1 - 값을 확인할 때

    }
}
