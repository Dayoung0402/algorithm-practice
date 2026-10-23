#include<vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
bool visited[100+1][100+1];
int dist[101+1][100+1]; // 거리 계산을 위해서 

int solution(vector<vector<int>> maps){
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    
    int row = maps.size(); // y축 길이
    int col = maps[0].size(); // X축 길이
    dist[0][0] = 1;
    
    queue<pair<int,int>> q;
    visited[0][0]= true; // 시작점 일단 방문처리
    q.push({0,0});
    
    vector<int> dx = {0,0,-1,1};
    vector<int> dy = {-1,1,0,0};
    
    while(!q.empty()) {
        
        auto out = q.front();
        q.pop();
        
        int x = out.first;
        int y = out.second;
        
        for(int i = 0; i < 4; i++) {
            int nX = x + dx[i];
            int nY = y + dy[i];
            
            if(nX < col && nX >= 0 && nY < row && nY >= 0) {
                if(!visited[nY][nX] && maps[nY][nX] == 1) {
                    visited[nY][nX] = true;
                    dist[nY][nX] = dist[y][x] + 1;
                    q.push({nX, nY});
                }
            }
        }
    }
    
    if(dist[row-1][col-1] == 0) {
        return -1;
    }
    
    answer = dist[row-1][col-1];
    return answer;
}