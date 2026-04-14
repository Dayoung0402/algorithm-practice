import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] array = new int[count];
        
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(array);
        
        for(int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }
}