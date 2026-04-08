import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        
        int[] array = new int[nums];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < nums; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        
        // 1부터 i까지의 누적 합 미리 만들어 놓기
        int[] sumArray = new int[nums + 1];
        sumArray[0] = 0;
        for(int i = 1 ; i <= nums; i++) {
            sumArray[i] = sumArray[i-1] + array[i-1];
        }
        
        for(int i = 0; i < count; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int result = 0;            
            int first =Integer.parseInt(st3.nextToken());
            int second = Integer.parseInt(st3.nextToken());
            
            result = sumArray[second] - sumArray[first-1];
            System.out.println(result);
        }
        
        
    }
}