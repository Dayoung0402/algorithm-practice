import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_one = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st_one.nextToken());
        int amount = Integer.parseInt(st_one.nextToken());
        
        int[] array = new int[num];
        StringTokenizer st_second = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < num; i++) {
            array[i] = Integer.parseInt(st_second.nextToken());
        }
        
        int sum = 0; 
        int result = 0;
        for(int k = 0; k < num; k++) {
            for(int j = k+1; j < num; j++) {
                for(int l = j+1; l < num; l++) {
                    sum = array[k] + array[j] + array[l]; //일단 합을 다 구하고
                    if(sum <= amount) {
                        result = Math.max(result, sum);
                    }
                }
            }
        }
        
        System.out.println(result);
        
        
    }
}