package SelectionSort;

import java.util.ArrayList;

public class SelectionSort {
    //시간복잡도(빅오표기법) = O(n^2)
    public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<>();
        for(int i = 10;i>0;i--){
            input.add(i);
        }
        System.out.println(selectionSort(input));

    }
    public static int smallest(ArrayList<Integer> n){
        int small = n.get(0);
        int smallIdx = 0;
        for(int i = 1;i< n.size();i++){
            if(n.get(i)<small){
                small=n.get(i);
                smallIdx=i;
            }
        }
        return smallIdx;
    }
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> n){
        ArrayList<Integer> newArr = new ArrayList<>();
        int smallestIdx;
        int size = n.size();
        for(int i = 0;i<size;i++){
            smallestIdx = smallest(n);
            newArr.add(n.get(smallestIdx));
            n.remove(smallestIdx);
        }
        return newArr;
    }
}
