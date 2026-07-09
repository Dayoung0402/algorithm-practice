import java.util.*;
import java.io.*; 

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int length_1 = progresses.length; // 기능의 개수
        
        // 남은 작업량
        int[] remain = new int[length_1];
        for(int i = 0; i < length_1; i++) {
            remain[i] = 100 - progresses[i];        
        }
        
        // 필요 작업 일수
        int[] days = new int[length_1];
        for(int i = 0 ; i < length_1; i++) {
            if(remain[i] % speeds[i] == 0) days[i] = remain[i] / speeds[i];
            else days[i] = remain[i] / speeds[i] + 1; //딱 안나올때는 하루 더 걸림
        }
        
        Stack<Integer> stack = new Stack<>();
        for(int i = length_1 - 1; i >= 0 ; i--) {
            stack.push(days[i]); // 9,3,7 들어감 (거꾸로)
        }
        
        // 스택에 남은 작업이 없을 떄까지
       
        while(stack.size() > 0) {
            int first = stack.pop();
            int count = 1;
            
            while (!stack.isEmpty() && stack.peek() <= first) {
                stack.pop();
                count++;
            }
            
            list.add(count);
        }
        

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}