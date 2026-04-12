import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] agrs) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int length = line.length();
        Character[] array = new Character[length];
        
        for(int i = 0; i < length; i++) {
            array[i] = line.charAt(i);
        }
        
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        
        for(Character cur : array) {
            if(cur == '<') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                
                sb.append(cur);
                flag = true;
                continue;
            }  
            
            else if(cur == '>') {
                sb.append(cur);
                flag = false;
                continue;
            }
            
            else if(cur == ' ') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(cur);
                continue;
            }
            
            if(flag) {
                sb.append(cur);
            }
            else {
                stack.push(cur);
            }                           
        }
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        System.out.println(sb);
        
        
    }
}