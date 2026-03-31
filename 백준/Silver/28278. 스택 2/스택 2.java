import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < time; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            
            if(first == 1) {
                int second = Integer.parseInt(st.nextToken());
                stack.push(second);
            }
            
            else if(first == 2) {
                if(!stack.isEmpty()) System.out.println(stack.pop());
                else System.out.println(-1);
            }
            
            else if(first == 3) {
                System.out.println(stack.size());
            }
            
            else if(first == 4) {
                if(!stack.isEmpty()) System.out.println(0);
                else System.out.println(1);
            }
            
            else if(first == 5) {
                if(!stack.isEmpty()) System.out.println(stack.peek());
                else System.out.println(-1);
            }
        }
    }
}