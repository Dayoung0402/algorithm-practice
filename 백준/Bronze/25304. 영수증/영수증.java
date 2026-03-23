import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalAmount = Integer.parseInt(br.readLine()); // 영수증에 찍힌 금액
        int realAmount = 0;
        int num = Integer.parseInt(br.readLine()); // 산 물건의 수
        
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());
            
            realAmount += price * amount;            
        }
        
        if(totalAmount != realAmount) System.out.println("No");
        else System.out.println("Yes");
    }
}