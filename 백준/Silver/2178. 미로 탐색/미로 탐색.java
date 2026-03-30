import java.util.*;
import java.io.*;

public class Main{
    
    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int first = cur[0];
            int second = cur[1];   
            
            for(int i = 0; i < 4; i++) {
            int nx = first + dx[i];
            int ny = second + dy[i];
            
                if(nx < 0 || ny < 0 || nx >= row || ny >= colum) continue;
                if(array[nx][ny] == 1) {
                    array[nx][ny] = array[first][second] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        
        System.out.println(array[row-1][colum-1]);
       
        
        
    }
    
    static int[][] array;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int row, colum;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st1.nextToken());
        colum = Integer.parseInt(st1.nextToken());

        array = new int[row][colum];
        
        for(int i = 0; i < row; i ++) {
            String line = br.readLine();
            for(int j = 0; j < colum; j++) {
                array[i][j] = line.charAt(j) - '0';
            }
        }
        
        bfs();
                

    }
}