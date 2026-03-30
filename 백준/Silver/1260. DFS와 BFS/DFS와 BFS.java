import java.util.*;
import java.io.*;

public class Main{
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        visited[start] = true;
        
        while(!que.isEmpty()) {
            int curr = que.poll();
            System.out.print(curr + " ");
            for(int next : graph[curr]) {
                if(!visited[next]) {
                    visited[next] = true;
                    que.offer(next);
                }
            }
        }
        
    }
    
    static void dfs(int cur) {
        visited[cur] = true;
        System.out.print(cur + " ");
        
        for(int next : graph[cur]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
    
    
    static ArrayList<Integer>[] graph;
    static boolean[] visited; 
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int node = Integer.parseInt(st1.nextToken()); // 노드 개수
        int link = Integer.parseInt(st1.nextToken()); // 간선 개수
        int start = Integer.parseInt(st1.nextToken()); // 탐색 시작점
        
        graph = new ArrayList[node + 1];
        visited = new boolean[node + 1]; 
        
        for(int i = 1; i <= node; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < link; i++) { // 그래프 저장
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            graph[a].add(b); 
            graph[b].add(a);
        }
        
        for(int i = 1; i <= node; i++) { // 노드-링크 정렬
            Collections.sort(graph[i]);
        }
        
        visited = new boolean[node + 1];
        dfs(start);
        System.out.println();
        visited = new boolean[node + 1];
        bfs(start);
        
        
        
    }
}