import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int setCount = Integer.parseInt(st.nextToken());
        int lineCount = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        for(int i = 0; i < setCount; i++) {
            set.add(br.readLine());
        }
        
        int count = 0;
        
        for(int i = 0; i < lineCount; i++) {
            String word =  br.readLine();
            if(set.contains(word)) count++;
        }
        
        System.out.println(count);

    }
}