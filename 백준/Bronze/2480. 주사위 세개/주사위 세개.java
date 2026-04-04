import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[3];
        
        for(int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array); // 배열 순서대로 정렬 3,4,5
               
        int result = 0; // 총 금액
        
        if(array[0] == array[1] && array[1] == array[2]) {
            result = 10000 + 1000 * array[0];
        }
        
        else if(array[0] != array[1] && array[1] != array[2] && array[0] != array[2]) {
            result = array[2] * 100;
        }
        
        else {
            result = array[1] * 100 + 1000;
        }
        
        System.out.println(result);
    }
}