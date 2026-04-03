import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        for(int i= 0; i < number; i++) {
            int count = 0;
            int sum = 0;
            String line = br.readLine();
            for(int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == 'O') {
                    count++;
                    sum += count;
                }
                else count = 0;
            }
            
            System.out.println(sum);
            
        }
        
    }
}