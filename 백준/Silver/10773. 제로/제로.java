import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine()); // 몇개의 숫자가 들어올지
        Deque<Integer> stack = new ArrayDeque<>(); // 사용할 스택 선언
        int result = 0;
        
        for(int i = 0; i < number; i++) {
            int input = Integer.parseInt(br.readLine()); // 스택에 들어온 숫자
            
            if(input == 0) stack.pop();
            else stack.push(input);
        }
        
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        
        System.out.println(result);
        
    }
}