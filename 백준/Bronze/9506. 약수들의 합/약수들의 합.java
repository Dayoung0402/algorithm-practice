import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        while(true) {
            int sum = 0;  
            int number = Integer.parseInt(br.readLine()); 
            
            if(number == -1) break;
            
            StringBuilder sb = new StringBuilder(); 
            
            for(int i = 1 ; i < number; i++) {               
                if(number % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }      
            
             if(number == sum) {
                 sb.setLength(sb.length() - 3); // sb의 길이 강제 줄임 (3) 만큼
                 System.out.println(number + " = " + sb);
             }
            
             else System.out.println(number + " is NOT perfect.");
            
        }
        
    }
}