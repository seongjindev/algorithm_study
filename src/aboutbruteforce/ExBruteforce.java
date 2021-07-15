package aboutbruteforce;

import java.util.Scanner;

public class ExBruteforce {
    //모든 경우의 수를 검사하는 알고리즘
    //백준 알고리즘 2798번
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int score = sc.nextInt();
        int tot = 0;
        int rst = 0;
        int[] box = new int[cnt];
        int min = 300000;
        for(int i = 0; i<cnt; i++){
            box[i] = sc.nextInt();
        }
        for(int i = 0; i<cnt-2; i++){
            for(int j = i+1; j<cnt-1; j++){
                for(int k = j+1; k<cnt; k++){
                    tot = box[i] + box[j] + box[k];
                    if(tot<=score){
                        int cal = Math.abs(tot-score);
                        if(cal<min){
                            min = cal;
                            rst = tot;
                        }
                    }
                }
            }
        }
        System.out.println(rst);
        sc.close();
    }
}
