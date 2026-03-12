import java.util.*;
import java.io.*;

public class Main{
    
    static long function(long n) {
        if(n == 1) return 1;
        else if(n== 0) return 1;
        else if(n > 1) return (n * function(n - 1));
        
        return 1;
    }
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Integer.parseInt(br.readLine());
        
        System.out.println(function(number));
    }
}