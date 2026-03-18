import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int remove = Integer.parseInt(st.nextToken());
        int[] array = new int[num]; 
        boolean flag = true;
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 1; i <= num; i++) {
            que.offer(i); // 큐에 1부터 순서대로 집어넣음
        }
        
        int check = 0;
        while(flag) {
            if(que.isEmpty()){
                flag = false;
            }
            
            else {
                for(int k = 1; k < remove; k++ ){
                    que.offer(que.poll());
                }
                array[check] = que.poll();
                check++;
            }           
        }
        
        System.out.print("<");
        for(int a = 0; a < num; a++) {
            if(a == num - 1) System.out.print(array[a] + ">");
            else System.out.print(array[a]+ ", ");
        }
        
        
        
    }
}