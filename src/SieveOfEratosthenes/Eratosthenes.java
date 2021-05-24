package SieveOfEratosthenes;

import java.util.*;

public class Eratosthenes {
    public static void main(String[] args){
        //임의의 자연수 n에 대해 그 이하의 소수를 찾는 가장 간단하고 빠른방법
        //시간 복잡도 = O(Nlog(logN))
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int ed = sc.nextInt();
        boolean[] box = new boolean[ed+1];
        Arrays.fill(box, true);
        box[0] = false;
        box[1] = false;
        for(int i = 2;i<=Math.sqrt(ed);i++){
            if(box[i]==false){
                continue;
            }
            for(int j = i*i;j<=box.length-1;j+=i){
                box[j] = false;
            }
        }
        for(int i = st;i<box.length;i++){
            if(box[i]==true){
                System.out.println(i);
            }
        }
    }
}
