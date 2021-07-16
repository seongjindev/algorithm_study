package Recursion;

import java.util.Scanner;

public class Factorial {
    //자신을 다시 호출하는 것이다
    //함수형 프로그래밍에서 사용된다
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fac(input));
        sc.close();

    }
    public static int fac(int n){
        if(n<=1){
            return 1;
        }else{
            return fac(n-1)*n;
        }
    }
    //재귀함수가 실행되는 것을 보면
    //5가 들어가게되면
    //fac(4)*5 -> fac(3)*4*5 -> fac(2)*3*4*5 -> fac(1)*2*3*4*5 -> 1*2*3*4*5
    //결국 1*2*3*4*5가 리턴되게 된다
}
