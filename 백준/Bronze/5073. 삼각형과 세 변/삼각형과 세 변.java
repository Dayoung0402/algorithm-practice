import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 2 5 6 입력 받음
            int one = Integer.parseInt(st.nextToken());
            
            if(one == 0) break; // 첫번째 원소가 0이라면 그냥 바로 아웃
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            
            int[] array = {one, two, three};
            Arrays.sort(array);
            
            if(array[0] + array[1] <= array[2]) System.out.println("Invalid");
            else {
                if(one == two && two == three) System.out.println("Equilateral");
                else if(one != two && two != three && one != three) System.out.println("Scalene");
                else System.out.println("Isosceles");       
            }       
        }               
    }
}