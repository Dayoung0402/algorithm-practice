import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int command = Integer.parseInt(br.readLine()); //명령 개수
        Deque<Integer> q = new ArrayDeque<>();
        
        for(int i = 0; i < command; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            
            if(first == 1) {
                int one = Integer.parseInt(st.nextToken());
                q.addFirst(one);
            }
            
            else if(first == 2) {
                int two = Integer.parseInt(st.nextToken());
                q.add(two);
            }
            
            else if(first == 3) {
                if(!q.isEmpty()) System.out.println(q.pollFirst());
                else System.out.println(-1);
            }
            
            else if(first == 4) {
                if(!q.isEmpty()) System.out.println(q.pollLast());
                else System.out.println(-1);
            }
            
            else if(first == 5) {
                System.out.println(q.size());
            }
            
            else if(first == 6) {
                if(!q.isEmpty()) System.out.println(0);
                else System.out.println(1);
            }
            
            else if(first == 7) {
                if(!q.isEmpty()) System.out.println(q.peekFirst());
                else System.out.println(-1);
            }
            
            else if(first == 8) {
                if(!q.isEmpty()) System.out.println(q.peekLast());
                else System.out.println(-1);
            }
            
        }
    }
}