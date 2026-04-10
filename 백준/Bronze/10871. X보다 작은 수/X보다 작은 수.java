import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int count = Integer.parseInt(st1.nextToken());
        int[] array = new int[count];
        int number = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
            if(array[i] < number) {
                sb.append(array[i]).append(" ");
            }
        }
        
        System.out.println(sb);
        
        
    }
}