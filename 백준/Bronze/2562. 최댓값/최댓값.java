import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        
        for(int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
        } // 배열에 다 집어넣고
        
        int max = array[0];
        int index = 0;
        
        for(int i = 0; i < 9; i++) {
            if(max <= array[i]) {
                max = array[i];
                index = i+1;
            }
            
        }
        
        System.out.println(max);
        System.out.println(index);
        
    }
}