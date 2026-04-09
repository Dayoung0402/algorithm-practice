import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        
        for(int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(array);
        
        int sum = 0;
        int mid = array[2];
        
        for(int i = 0; i < 5; i++) {
            sum += array[i];
        }
        
        System.out.println((int)sum/5);
        System.out.println(mid);
    }
}