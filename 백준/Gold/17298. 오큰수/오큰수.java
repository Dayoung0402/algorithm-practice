import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] array =  new int[count]; // 일단 원소들을 받을 배열
        int[] result = new int[count]; // 출력 값을 담을 배열
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        Stack<Integer> stack = new Stack<>();         
        for(int i = 0; i < count; i++) {           
            while(!stack.isEmpty() && array[stack.peek()] < array[i]) {                
                result[stack.pop()] = array[i];                
            }   // while 돌면서 스택 맨위에 가져오고 비교하고
            
            stack.push(i); // 스택에 현재값 집어넣고
        }
        
        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        } // 스택에 남아있는 값들은 -1로 모두 처리하고
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            sb.append(result[i]).append(" ");
        }
            
        System.out.println(sb);
      
        
    }
}