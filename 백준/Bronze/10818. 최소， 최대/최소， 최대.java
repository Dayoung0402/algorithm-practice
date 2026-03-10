import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < num ; i ++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = array[0];
        int min = array[0]; // 초기화 필요
        
        for(int j = 0; j< num; j++) {
            if(array[j] > max) {
                max = array[j];
            }
            if(array[j] < min) {
                min = array[j];
            }
        }
        
        System.out.print(min + " " + max);
    }
}