import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        
        int[] array = new int[count]; 
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        int result = 0; // 동전 개수 (최종 리턴값)
        
        while(goal > 0) {
            boolean flag = false;
            int num = 0;
            
            for(int i = 0; i < count; i++) {
                if(array[i] > goal && i > 0) {
                    num = goal / array[i-1]; // 빼갈 수 있는 동전 개수
                    goal = goal - num * array[i-1]; // 빼갈 수 있는 금액만큼 빼고
                    result += num; // 동전 개수 더하고
                    flag = true;
                    break;
                }
            } 
            
            if(!flag) {
                num = goal / array[count-1]; // 빼갈 수 있는 동전 개수
                goal = goal - num * array[count-1]; // 빼갈 수 있는 금액만큼 빼고
                result += num; // 동전 개수 더하고
            }
        }

        
        System.out.println(result);
        
    }
}