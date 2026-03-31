import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int subin = Integer.parseInt(st.nextToken());
        int brother = Integer.parseInt(st.nextToken());
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        int[] distance = new int[100001];
        q.offer(subin);
        visited[subin] = true;
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            if(cur == brother) {
                System.out.print(distance[cur]);
                break;
            }
            
            for(int next : new int[]{cur-1, cur+1, cur*2}) {
                if(next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[cur] + 1;
                    q.offer(next);
                }
            }          
        }
        
    }
}