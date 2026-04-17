import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int length = arr.length;        
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < length; i++) {
            if(!stack.isEmpty()) {
                if(stack.peek() == arr[i]) continue;
            }
            
            stack.push(arr[i]);
        }
        
        int[] answer = new int[stack.size()];
        
        int index = stack.size();
        
        while(!stack.isEmpty() && index >= 0) {
            answer[index-1] = stack.pop();
            index--;
        }
        

        return answer;
    }
}