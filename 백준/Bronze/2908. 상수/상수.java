import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String one = st.nextToken();
        String two = st.nextToken();
        
        StringBuffer sb1 = new StringBuffer(one);
        String first = sb1.reverse().toString();
        int first_num = Integer.parseInt(first);
        
        StringBuffer sb2 = new StringBuffer(two);
        String second = sb2.reverse().toString();
        int second_num = Integer.parseInt(second);
        
        int result = 0;
        if(first_num >= second_num) result = first_num;
        else result = second_num;
        
        System.out.println(result);
        
    }
}