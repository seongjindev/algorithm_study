package SimpleSearch;

import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args){
        //0~10000까지 숫자
        //특정 숫자가 있는지 확인
        //단순탐색
        //빅오 표기법 = O(n)
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int min=0,max = 10000,cnt=0;
        for(int i = min;i<=max;i++){
            cnt++;
            if(input==i){
                System.out.println(i+"를 "+cnt+"번째만에 찾았습니다.");
            }
        }
    }
}
