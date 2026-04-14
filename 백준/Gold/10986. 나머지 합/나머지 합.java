import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        
        int[] array = new int[count];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        
        long[] remain = new long[num];
        long sum = 0;
        long answer = 0;
        remain[0] = 1;

        // 누적합 구하면서 바로 나누면서 나머지로 판단
        for(int i = 0; i < count; i++) {
            sum = (sum + array[i]) % num; // 누적합 만들고 숫자로 나누고 나머지 구하고
            answer += remain[(int)sum]; // 위에서 구한 나머지를 인덱스로 가지는 나머지 배열의 값을 더하고
            remain[(int)sum]++; // 그 나머지 인덱스 배열의 수 증가시키고
        }

        System.out.println(answer);
        
        
        
    }
}