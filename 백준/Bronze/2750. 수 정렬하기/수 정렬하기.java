import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] array = new int[count];
        
        for(int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            array[i] = num;
        }
        
        Arrays.sort(array); 
        
        for(int j = 0; j < count; j++) {
            System.out.println(array[j]);
        }
    }
}