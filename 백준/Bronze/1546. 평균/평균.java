import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 예시 3
        float max = 0;
        float sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        float[] array = new float[num];
        
        for(int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < num; i++) {
            if(max <= array[i]) max = array[i];
        }
        
        for(int i = 0; i < num; i++) {
            array[i] = array[i]/max*100;
        }
        
        for(int i = 0; i < num; i++) {
            sum += array[i];
        }
        
        System.out.println(sum/num);
    }
}