import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[num];
        int result = 0;
        
        for(int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        int target = Integer.parseInt(br.readLine());
        
       for(int i = 0; i < num; i++) {
            if(target == array[i]) result++;
       } 
        
        System.out.println(result);
    }
}