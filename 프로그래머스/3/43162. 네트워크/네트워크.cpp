#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
vector<int> graph[200+1];
bool visited[200+1];

void dfs(int cur) {
    
    visited[cur] = true;
    
    for(int next : graph[cur]) {
        if(!visited[next]) {
            visited[next] = true;
            dfs(next);
            
        }
    }
    
}

int solution(int n, vector<vector<int>> computers) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    int len_com = computers.size();
    
    // 양방향 그래프로 표현
    for(int i = 0; i < len_com; i++) {
        for(int j = 0; j < len_com; j++) {
            if(computers[i][j] == 1) {
                int first = i+1;
                int second = j+1;
                
                graph[first].push_back(second);
                graph[second].push_back(first);
                
            }
        }
        
    }
    
    for(int i = 1; i <= len_com; i++) {
        if(!visited[i]) {
            answer++;
            dfs(i);
        }
    }
    
    
    return answer;
}