import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
        
        while(true) {
            String line = br.readLine();
            if(line.equals(".")) break; // . 문자열이 들어오면 바로 반복문 빠져나옴 -> 종료
            
            Deque<Character> stack = new ArrayDeque<>();           
            boolean flag = true; 

            for(int i = 0; i < line.length(); i++) {
                // 괄호 두 종류가 들어왔을 때만 받기
                if(line.charAt(i) == '(' || line.charAt(i) == ')' || line.charAt(i) == '[' || line.charAt(i) == ']' ) {
                    // () 검사로직
                    
                    char one = line.charAt(i);
                    
                    if(one == '(' || one == '[') {
                        stack.push(one);
                    } 
                    
                    else if(one == ')') {
                        if(stack.isEmpty() || stack.peek() != '(') {
                            flag = false;
                            break;
                        } else stack.pop();
                    }
                    
                    else if(one == ']'){
                        if(stack.isEmpty() || stack.peek() != '[') {
                            flag = false;
                            break;
                        } else stack.pop();
                        
                    }
                }
             
          }
            if(flag && stack.isEmpty()) {
                System.out.println("yes");
            } else System.out.println("no");
                
         
      }       
   }
}