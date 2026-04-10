import java.util.*;
import java.io.*;

public class Main{
    
    static int fac(int start) {       
        if(start == 0) {
            return 1;
        }  
        return start * fac(start -1);      
    }
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(fac(number));
        
    }
}