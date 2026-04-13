import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int command = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < command; i++) {
            
            String line = br.readLine(); // 문자열 받고
            StringBuilder sb = new StringBuilder();
            int length = line.length();
            
            if(length == 1) {
                sb.append(line.charAt(0)).append(line.charAt(0));
            }
            else {
                sb.append(line.charAt(0)).append(line.charAt(length-1));
            }
            
            System.out.println(sb);
        }
    }
}