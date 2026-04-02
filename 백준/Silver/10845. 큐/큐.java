import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        
        for(int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            
            if(word.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                q.offer(input);
            }
            
            else if(word.equals("pop")) {
                if(!q.isEmpty()) {
                    System.out.println(q.poll());
                }
                else System.out.println(-1);
            }
            
            else if(word.equals("size")) {
                System.out.println(q.size());
            }
            
            else if(word.equals("empty")) {
                if(q.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            
            else if(word.equals("front")) {
                if(!q.isEmpty()) {
                    System.out.println(q.peekFirst());
                }
                else System.out.println(-1);
            }
            
            else if(word.equals("back")) {
                if(!q.isEmpty()) {
                    System.out.println(q.peekLast());
                }
                else System.out.println(-1);
            }
        }
        
    }
}