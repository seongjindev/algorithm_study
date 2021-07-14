package greedyalgorithm;

import java.util.Scanner;

public class ExGreedy {
    //매 선택에서 지금 이 순간 당장 최적인 답을 선택하여 적합한 결과를 도출
    //백준 알고리즘 11047 문제
    //항상 최적의 결과를 보장하지는 못한다
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] wonBox = new int[cnt];
        int won = sc.nextInt();
        for(int i = 0;i<cnt; i++){
            wonBox[i] = sc.nextInt();
        }
        int dcnt = cnt-1;
        int tot = 0;
        while(won>0){
            if(won>=wonBox[dcnt]){ //매 선택에서 최적인 답
                won -= wonBox[dcnt];
                tot++;
            }else{
                dcnt--;
            }
        }
        System.out.println(tot);
    }
}
