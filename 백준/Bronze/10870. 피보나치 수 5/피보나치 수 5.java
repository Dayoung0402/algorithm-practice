import java.util.*;
import java.io.*;

public class Main{
    
    static int first = 0; 
    static int second = 1; 
    
    static void function(int num) {
        if(num > 1) {
            int buffer = second;
            second = first + second;
            first = buffer;
            num--;
            function(num);
        }
        else if(num == 1) System.out.println(second);
        else if(num == 0) System.out.println(0);
        
        
    }
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        function(num);    
    }
}