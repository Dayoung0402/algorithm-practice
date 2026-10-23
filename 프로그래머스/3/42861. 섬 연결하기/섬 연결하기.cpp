#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(int n, vector<vector<int>> costs) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0; // 최소 비용
    int len = costs.size(); 
    //int node_num;
    bool visited[100+1]= {0};
    set<int> s;
    vector<pair<int,int>> graph[100]; // graph[0] = {(1,1), (2,2)}
    
    for(int i = 0; i < len; i++) {
        graph[costs[i][0]].push_back({costs[i][1], costs[i][2]}); // grahp[0] = {(1,1)}
        graph[costs[i][1]].push_back({costs[i][0], costs[i][2]}); // grahp[1] = {(0,1)} 
        
        //s.insert(costs[i][0]);
        //s.insert(costs[i][1]);
    }
    
    //node_num = s.size(); // 4 (진짜 노드 개수)
    
    priority_queue<
    pair<int,int>,
    vector<pair<int,int>>,
    greater<pair<int,int>>
    > pq;
    
    visited[0] = true;
    for(const auto& price : graph[0]) {
        pq.push({price.second, price.first}); // 비용 먼저 {비용, 노드}
    }
    
    while(!pq.empty()) {
        auto cur = pq.top();
        pq.pop();

        int cost = cur.first;
        int next = cur.second;

        if(visited[next]) {
            continue;
        }
        
        visited[next] = true;
        answer += cost;
        
        for(const auto& edge : graph[next]) {
            if(!visited[edge.first]) {
            // pq에 {비용, 도착노드} 추가
                pq.push({edge.second, edge.first});
            }
        }
    }
    
    
    return answer;
} 