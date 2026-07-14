import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        
        int lengthOfs = s.length(); // 받은 문자열의 길이
        Character[] array = new Character[lengthOfs];
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < lengthOfs; i++) {
            array[i] = s.charAt(i);
        } // 일단 배열에 하나씩 넣고
                
        for(int i = 0; i < lengthOfs; i++) {
            
            if(stack.isEmpty()) {
                if(array[i] == ')')  {
                    return false;
                }
                stack.push(array[i]);
                continue;
            } // 스택이 비어있으면 일단 첫번째 원소 넣고
            
            // 스택에 뭐라도 있으면(2번쨰 원소 확인부터)
            Character c = stack.peek();
            if(array[i] == c) {
                stack.push(c);
            }
            else stack.pop();            
        }
        
        if(!stack.isEmpty()) answer = false;
        return answer;
        
    }
}