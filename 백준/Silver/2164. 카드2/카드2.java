import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine()); 
        boolean flag = true;
        int result = 0;
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 1; i <= number; i++) {
            que.offer(i);
        } // 큐 안에 집어 넣고
        
        while(flag) { // 큐 사이즈가 1일때까지 반복작업
            if(que.size() == 1) {
                flag = false;
                result = que.peek();
            }
            else {
                que.poll(); // 맨 위의 원소 바깥으로 꺼내고
                que.offer(que.poll()); // 그리고 이후에 첫번째 원소를 아래로 넣고
            }
        }
        
        System.out.println(result);
        
    }
}