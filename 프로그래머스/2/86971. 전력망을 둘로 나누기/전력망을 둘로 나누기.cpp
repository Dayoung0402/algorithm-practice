#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
vector<int> graph[100+1];
bool visited[100+1];

int countnode(int current, int exclude) {
    
    visited[current] = true; // 일단 방문 처리하고
    
    int count = 1; // 처음에는 1로 갯수 시작
    
    for(int next : graph[current]) {
        if(visited[next] || next == exclude) {
            continue;
        } else {
            visited[next] = true;
            count += countnode(next, exclude);
        }
    }
    
    return count;
    
}

int solution(int n, vector<vector<int>> wires) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = n;
    int node = wires.size();
    
    // 그래프 양 방향으로 넣고
    for(int i = 0; i < node; i++) {
        int first = wires[i][0];
        int second = wires[i][1];
        
        graph[first].push_back(second);
        graph[second].push_back(first);   
    }
    
    for(int i = 0; i < node; i++) {
        
        int left = wires[i][0];
        int right = wires[i][1];
        
        // 연결된 노드 양쪽 숫자 각각 판단해서 그 개수의 차이로 판단
        memset(visited, 0, sizeof(visited));
        int abs1 = countnode(left, right);
        
        memset(visited, 0, sizeof(visited));
        int abs2 = countnode(right, left);
        
        int check = abs(abs1-abs2);
        if(check <= answer) {
            answer = check;
        }
    }
    
    
    return answer;
}