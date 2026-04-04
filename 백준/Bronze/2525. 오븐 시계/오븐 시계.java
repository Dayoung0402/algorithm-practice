import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken()); // 시작 시간
        int min = Integer.parseInt(st.nextToken()); // 시작 분
        int require =Integer.parseInt(br.readLine()); // 걸리는 시간 : 88분
        
        int requiredHour = (int)require/60; // 88분 -> 1시간
        int requiredMin = require%60; // -> 22분
        
        int result_h = 0;
        int result_m = 0;
        
        if(requiredMin + min >= 60) {
            result_h = hour + requiredHour + 1;
            result_m = requiredMin + min - 60;
        }
        
        else if(requiredMin + min < 60) {
            result_h = hour + requiredHour;
            result_m = requiredMin + min;
        }
        
        if(result_h >= 24) {
            result_h -= 24;
        }
        
        System.out.println(result_h + " " + result_m);
      
    }
}