import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int[] array = new int[count];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        
        Arrays.sort(array);
        System.out.println(array[count - line]);
    }
}