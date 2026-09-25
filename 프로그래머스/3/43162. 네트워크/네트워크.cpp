#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> graph[200+1]; // 여기서는 graph[4];
bool visited[200+1];
int answer = 0;

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
    
    // computer 연결 그래프로 표현
    
    for(int i = 0; i < n; i++) {
        for(int j = i+1; j < n; j++) {
            if(computers[i][j] ==1) {
                graph[i].push_back(j);
                graph[j].push_back(i);                
            }
        }
    } //무 방향 그래프니깐 양쪽으로 집어넣고
    
    for(int i = 0; i < n; i++) {
        if(!visited[i]) {
            answer++;
            dfs(i);    
        }    
    }
    
    
    return answer;
}