#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
vector<int> graph[100+1];
bool visited[100+1];

int dfs(int current, int exclude) {
    
    visited[current] = true;
    
    int count = 1;
    
    for(int next : graph[current]) {
        if(visited[next] || next == exclude) {
            continue;
        } else {
            count += dfs(next, exclude);
        }
    }
    
    return count;
}

int solution(int n, vector<vector<int>> wires) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = n;
    int total_len = wires.size();
    
    // 그래프에 양방향으로 넣고
    for(int i = 0; i < total_len; i++) {
        int first = wires[i][0];
        int second = wires[i][1];
        
        graph[first].push_back(second);
        graph[second].push_back(first);   
    }
    
    // 나눠서 dfs에 넣고 절댓값을 계산
    for(int i = 0; i < total_len; i++) {
        
        int left = wires[i][0];
        int right = wires[i][1];
        
        memset(visited,0,sizeof(visited));
        int one = dfs(left, right);
        memset(visited,0,sizeof(visited));
        int two = dfs(right, left);
        
        int check = abs(one - two);
        if(check <= answer) {
            answer = check;
        }
    }
    
    
    return answer;
}