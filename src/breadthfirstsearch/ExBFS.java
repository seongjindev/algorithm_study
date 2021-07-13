package breadthfirstsearch;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExBFS {
    //백준알고리즘 2606문제
    public static int rstCom(int comCnt, boolean[][] chk){
        Queue<Integer> chkNum = new LinkedList<>();
        chkNum.offer(1);
        int tot = 0;
        boolean[] visit = new boolean[comCnt+1]; //만약 재귀함수로 쓴다면 클래스 변수로 해야한다
        while(!chkNum.isEmpty()){
            int num = chkNum.poll();
            for(int i = 1;i<comCnt+1;i++){
                if(chk[num][i]==true && visit[i]==false){
                    chkNum.offer(i);
                    visit[i] = true;
                    tot++;
                }
            }
        }
        return tot-1;

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int comCnt = sc.nextInt();
        int nodeCnt = sc.nextInt();
        boolean[][] chk = new boolean[comCnt+1][comCnt+1];

        for(int i = 0;i<nodeCnt;i++){
            int fir = sc.nextInt();
            int snd = sc.nextInt();
            chk[fir][snd] = true;
            chk[snd][fir] = true;
        }
        System.out.println(rstCom(comCnt, chk));
    }
}
