import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        Set<Integer> set = new HashSet<>(); 
        for(int i = 1; i <= 30; i++) { // 일단 1부터 30까지의 숫자들을 넣어야 함
            set.add(i);
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int k = 0; k < 28; k++) {
            int num = Integer.parseInt(br.readLine());
            set.remove(num);
        }
        
        for (int x : set) {
            System.out.println(x);
        }
    }
}