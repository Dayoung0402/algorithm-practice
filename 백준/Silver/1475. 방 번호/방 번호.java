import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] check = new int[10]; // 0부터 9까지 들어갈 수 있으니 10개 index
        int count = 0;
        
        for(int i = 0; i <line.length(); i++) {
            int num = line.charAt(i) - '0';
            check[num]++;
        } // 여기까지가  [9,9,9] 숫자 배열로 바꿈
        
        int sixNine = check[6] + check[9];
        check[6] = (sixNine + 1) / 2;
        check[9] = 0;
        
        int result = 0;
        for(int i = 0; i < 10; i++) {
            result = Math.max(result, check[i]);
        }
        System.out.println(result);
    }
}