import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count  = Integer.parseInt(br.readLine());
        int[] array = new int[count];
        int result = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < count; i++) {
            boolean flag = true;
            
            if(array[i] == 2) result++;
            else if(array[i] > 2) {
                for(int j = 2; j < array[i]; j++) {
                    if(array[i]%j == 0) flag = false;                  
                }
                if(flag) result++;
            }
        }
        
        System.out.println(result);
    }
}