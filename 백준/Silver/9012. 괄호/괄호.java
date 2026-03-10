import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 몊번의 test인지
             
        for(int i = 0; i < num; i++) {
            Deque<Integer> stack = new ArrayDeque<>();
            boolean valid = true;
            String line = br.readLine();
            
            for(int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == '(') stack.push(1);
                else if (!stack.isEmpty() && line.charAt(j) == ')') {
                    stack.pop();
                    }
                else {
                    valid = false;
                    break;
                }
             }
      
            if(valid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}