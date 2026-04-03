import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st1.nextToken()); // 몇개 들어올지
        int group = Integer.parseInt(st1.nextToken()); // 몇개로 묶을지
        int[] array = new int[count];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++) { // 배열에 싹다 넣고
            array[i] = Integer.parseInt(st2.nextToken());
        }
        
        int sum = 0;
        for(int  i = 0; i < group; i++) {
            sum += array[i];    
        }
        
        int max = sum;
        
        for(int i = 0; i < count - group; i++) {
            sum = sum - array[i] + array[i + group]; 
            max = Math.max(max,sum);
        }
        
        System.out.println(max);

             
    }
}