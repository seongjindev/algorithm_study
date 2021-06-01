package Memoization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//컴퓨터 프로그래밍 용어로, 동일한 계산을 반복해야 할 경우 한 번 계산한 결과를 메모리에 저장해 두었다가 꺼내 씀으로써 중복 계산을 방지할 수 있게 하는 기법
//동적 계획법의 핵심이 되는 기술이다
//백준 1003번 문제
public class Memoization {
    static Integer[][] box;
    public static Integer[] fb(int n){
/*        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fb(n-1) + fb(n-2);
        }*/
        if(box[n][0]==null && box[n][1] ==null){
            box[n][0]=fb(n-1)[0]+fb(n-2)[0];
            box[n][1]=fb(n-1)[1]+fb(n-2)[1];
        }
        return box[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());
        box = new Integer[41][2];
        box[0][0] = 1;
        box[0][1] = 0;
        box[1][0] = 0;
        box[1][1] = 1;
        for(int i = 0;i<input;i++){
            int n = Integer.parseInt(br.readLine());
            fb(n);
            sb.append(box[n][0]+" "+box[n][1]+"\n");
        }
        System.out.println(sb);
    }
}
