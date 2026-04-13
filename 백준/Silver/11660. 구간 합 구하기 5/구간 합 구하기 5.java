import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int matrix = Integer.parseInt(st.nextToken());
        int command = Integer.parseInt(st.nextToken());
        
        int[][] array = new int[matrix + 1][matrix + 1];
        for(int i = 1; i <= matrix; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            
            for(int j = 1; j <= matrix; j++) {
                array[i][j] = Integer.parseInt(st2.nextToken()); 
            } //2차원 배열로 값들 받고
        }
        
        // 2차원 배열의 누적합 구하고
        int[][] sum = new int[matrix + 1][matrix + 1];
        for(int i = 1; i <= matrix; i++) {
            for(int j = 1; j <= matrix; j++) {
            sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + array[i][j];
            }
        }
        
        // 처리할 명령 받고
        for(int i = 0; i < command; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st3.nextToken());
            int y1 = Integer.parseInt(st3.nextToken());
            int x2 = Integer.parseInt(st3.nextToken());
            int y2 = Integer.parseInt(st3.nextToken());
            
            int result = sum[x2][y2]- sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
            
            System.out.println(result);
        }
        
    }
}