import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());  
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken(); // 명령어 받음
            
            if(word.equals("push")) {
                int number = Integer.parseInt(st.nextToken()); // 숫자 받음
                stack.add(number);
            }
            
            else if(word.equals("pop")) {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pop());
            }
            
            else if(word.equals("size")) {
                System.out.println(stack.size());
            }
            
            else if(word.equals("top")) {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.peek());
            }
            
            else if(word.equals("empty")) {
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
           
        }
        
    }
}