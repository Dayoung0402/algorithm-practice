import java.util.*;
import java.io.*;

public class Main{
    
    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visit[start] = true;
        distance[start] = 0;
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            
            for(int next : graph[cur]) {                              
                if(!visit[next]) {
                    visit[next] = true;
                    distance[next] = distance[cur] + 1;
                    q.offer(next);
                }
            }
        }
        
    }
    
    static boolean[] visit;
    static int[] distance;
    static ArrayList<Integer>[] graph;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine()); // 9명 사람
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sub1 = Integer.parseInt(st.nextToken()); // 첫번째 대상 7
        int sub2 = Integer.parseInt(st.nextToken()); // 두번째 대상 3
        
        int count = Integer.parseInt(br.readLine());
        graph = new ArrayList[people + 1];
        visit = new boolean[people + 1];
        distance = new int[people + 1];
        
        for (int i = 1; i <= people; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < count; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st2.nextToken());
            int second = Integer.parseInt(st2.nextToken());
            
            graph[first].add(second);
            graph[second].add(first);
        }
        
        bfs(sub1);
        if(visit[sub2])
        System.out.println(distance[sub2]);
        else System.out.println(-1);
        
    }
}