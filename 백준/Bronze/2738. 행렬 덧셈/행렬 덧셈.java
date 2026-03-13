import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 세로 숫자 개수
        int m = Integer.parseInt(st.nextToken()); // 가로 숫자 개수
        
        int[][] array_one = new int[n][m]; // 첫번째 받을 2차원 배열
        int[][] array_two = new int[n][m]; // 두번째 받을 2차원 배열
        int[][] result = new int[n][m];
        String line = "";
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());   
            for(int j = 0 ; j < m; j++) {
                int a = Integer.parseInt(st1.nextToken()); 
                array_one[i][j] = a;
            } 
        }
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());   
            for(int j = 0 ; j < m; j++) {
                int b = Integer.parseInt(st2.nextToken()); 
                array_two[i][j] = b;
            } 
        }
        
        for(int k = 0; k < n; k++) {
            for(int l = 0; l < m; l++) {
                result[k][l] = array_one[k][l] + array_two[k][l];
            } 
        }
        
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
            
        
    }
}