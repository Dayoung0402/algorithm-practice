import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[9][9];
        int num_one = 0;
        int num_second = 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                array[i][j] = Integer.parseInt(st.nextToken()); 
            }
        }
        
       for(int i = 0 ; i < 9; i++) {           
            for(int j = 0; j < 9; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                    num_one = i;
                    num_second = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println((num_one + 1) + " " + (num_second + 1));
        
        
        
        
    }
}