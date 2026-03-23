import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken()); 
            
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i+1).append(": ").append(a+b);
            System.out.println(sb);
        }
    }
}