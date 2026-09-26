#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
vector<int> graph[200+1]; 
bool visited[200+1];
int answer = 0;

void dfs(int cur) {
    
    for(int next : graph[cur]){
        if(!visited[next]){
            visited[next] = true;
            dfs(next);
        }
    }
}

int solution(int n, vector<vector<int>> computers) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
   //일단 그래프에 집어넣어서 보기 좋게
    for(int i = 0; i< n; i++) {
        for(int j = i+1; j < n; j++) {
            if(computers[i][j] == 1) {
                graph[i].push_back(j);
                graph[j].push_back(i);
            }            
        }
    }
    
    for(int i = 0; i< n; i++) {
        if(!visited[i]) {
            answer++;
            dfs(i);
        }
    }
    
    
    return answer;
}