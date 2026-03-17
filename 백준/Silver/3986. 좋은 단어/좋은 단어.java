import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 몇번 반복
        int result = 0;
        
        for(int k = 0; k < num; k++) {
           Deque<Character> stack = new ArrayDeque<>();
           String line = br.readLine();
           for(int i = 0; i < line.length(); i++) {
               if(line.charAt(i) == 'A') {
                   if(stack.isEmpty()) {
                       stack.push(line.charAt(i));
                   }
                   else {
                       if(stack.peek() == line.charAt(i)) stack.pop();
                       else stack.push(line.charAt(i));
                  }
               }
            
                   if(line.charAt(i) == 'B') {
                   if(stack.isEmpty()) {
                       stack.push(line.charAt(i));
                   }
                   else {
                       if(stack.peek() == line.charAt(i)) stack.pop();
                       else stack.push(line.charAt(i));
                   }
               }
           }
          if(stack.isEmpty()) result++;
        }
        
        System.out.println(result);
    }
}