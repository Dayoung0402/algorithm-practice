import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 몇번 돌건지
        
        for(int i = 0; i < num; i++) {
            String line = br.readLine();
            int length = line.length(); // 받은 문자열의 길이 확보
            Deque<Integer> stack = new ArrayDeque<>(); // 스택 선언
            boolean valid = true; // 스택이 차있는지(true), 비어있는지(false)
            
            for(int j = 0; j < length; j++) {
                if(line.charAt(j) == '(') {
                    stack.push(1);
                }
                else {
                    if(stack.isEmpty()) {
                        valid = false;
                        break;
                    } else stack.pop();
                }
            }
            
            if(valid && stack.isEmpty()){
                System.out.println("YES");
            } else System.out.println("NO");
            
            
        }
        
    }
}
