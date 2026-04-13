import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));           
        String line;
        
        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            System.out.println(first + second);
            
        }
    }
}