import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] agrs) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int colum = Integer.parseInt(st.nextToken());
        
        // 2차원 배열 받고
        int[][] array = new int[row][colum];
        for(int i = 0; i < row; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < colum; j++) {
                array[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        
        // 누적합 만들고
        int[][] sum = new int[row+1][colum+1];
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= colum; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + array[i-1][j-1];
            }
        }
        
       // 명령 받고 처리하자
        int command = Integer.parseInt(br.readLine());
        for(int i = 0; i < command; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            
            int x1 = Integer.parseInt(st3.nextToken());
            int y1 = Integer.parseInt(st3.nextToken());
            int x2 = Integer.parseInt(st3.nextToken());
            int y2 = Integer.parseInt(st3.nextToken());
            
            int result = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
            System.out.println(result);
            
        }
    }
}