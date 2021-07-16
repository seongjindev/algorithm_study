package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        //0~10000까지 숫자
        //특정 숫자가 있는지 확인
        //이진탐색
        //빅오 표기법 = O(log n)
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int min = 1,max = 10000,mid=0,cnt =0;
        while(min<=max){
            cnt++;
            mid = (int)Math.floor((double)(min+max)/2);
            if(input==mid){
                break;
            }else if(input>mid){
                min = mid+1;
            }else if(input<mid){
                max = mid-1;
            }
        }
        System.out.println(mid+"를 "+cnt+"번째만에 찾았습니다.");
    }
}
