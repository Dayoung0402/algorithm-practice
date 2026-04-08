import java.util.*;
import java.io.*;

public class Main{
    
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int result = 0;
    
    static void dfs(int cur) {
        visited[cur] = true;
        result++;
        for(int next : graph[cur]) {
            if(!visited[next]) {
                visited[next] = true;
                dfs(next);
            }
        }
    }
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int link = Integer.parseInt(br.readLine());
        
        visited = new boolean[computer + 1];
        graph = new ArrayList[computer+ 1];
        
        for(int  i = 1; i <= computer; i++) {
            graph[i] = new ArrayList<>();
        } // 그래프 자리 만들고
        
        for(int i = 0; i < link; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            
            graph[first].add(second);
            graph[second].add(first);            
        } // 그래프에 입력 값들 집어넣고
        
        dfs(1);
        System.out.println(result-1); //1번 컴터는 제외!!!!
        
    }
}