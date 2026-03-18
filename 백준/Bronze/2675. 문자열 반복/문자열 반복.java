import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken()); // 3 받음
            String letter = st.nextToken(); // abc 받음
            String result = "";
            
            for(int k = 0; k < letter.length(); k++) {
                for(int j = 0;  j < check; j++) {
                    result += letter.charAt(k);
                }
            }
            
            System.out.println(result);
            
        }
    }
}