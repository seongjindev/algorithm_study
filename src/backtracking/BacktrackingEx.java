package backtracking;

import java.util.Scanner;

public class BacktrackingEx {
    //모든 경우의 수를 전부 고려하는 알고리즘
    //백준알고리즘 15650 문제
    public static int[] arr;
    public static boolean[] vs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        vs = new boolean[N];
        arr = new int[M];
        dfs(N,M,0,0);
        sc.close();
    }

    public static void dfs(int N, int M,int I, int depth) {
        if(M==depth){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for(int i = I;i<N;i++){
            if(!vs[i]){
                vs[i] = true;
                arr[depth] = i+1;
                dfs(N,M,i,depth+1);
                vs[i] = false;
            }
        }
    }
}
