package QuickSort;

import java.io.*;
import java.util.ArrayList;

public class QuickSort {
    //빅오 표기법 = 평균 O(nlogn) 최악 O(n^2)
    //백준 알고리즘 2751문제 - 퀵정렬로 안됨 병합정렬을 사용해야함
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> box = new ArrayList<>(n);
        for(int i = 0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            box.add(x);
        }
        ArrayList<Integer> output;
        output = quick(box);
        for(int i = 0;i<output.size();i++){
            bw.write(output.get(i)+"\n");
        }
        bw.flush();
        bw.close();

    }
    public static ArrayList<Integer> quick(ArrayList<Integer> arr){
        ArrayList<Integer> join = new ArrayList<>();
        if(arr.size()>0){
            int a = arr.get(0);
            ArrayList<Integer> low = new ArrayList<>();
            ArrayList<Integer> high = new ArrayList<>();
            for(int i = 1;i<arr.size();i++){
                if(arr.get(i)<a){
                    low.add(arr.get(i));
                }else{
                    high.add(arr.get(i));
                }
            }
            join.addAll(quick(low));
            join.add(a);
            join.addAll(quick(high));
        }
        return join;
    }
}