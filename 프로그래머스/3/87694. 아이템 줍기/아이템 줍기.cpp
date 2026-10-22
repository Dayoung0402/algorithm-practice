#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
bool visited[102][102];
int answer = 0;
int board[102][102] = {0};
int dist[102][102] = {0};

void bfs(int charX, int charY, int itemX, int itemY) {
    
    queue<pair<int,int>> q;
    q.push({charX, charY});
    visited[charY][charX] = true;
    
    while(!q.empty()) {
        
        int curX = q.front().first;
        int curY = q.front().second;
        q.pop();
        
        int dx[4] = {0,0,-1,1};
        int dy[4] = {-1,1,0,0};
        
        for(int i = 0 ; i < 4; i++) {
            int nextX = curX + dx[i];
            int nextY = curY + dy[i];
            
            if(nextY < 102 && nextX < 102 && nextX >= 0 && nextY >=0) {
                if(!visited[nextY][nextX] && board[nextY][nextX] == 1) {
                    visited[nextY][nextX] = true;
                    dist[nextY][nextX] = dist[curY][curX] + 1;
                    q.push({nextX, nextY});
                }
            }
        }
        
    }
    
    
}

int solution(vector<vector<int>> rectangle, int characterX, int characterY, int itemX, int itemY) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    // bfs를 적용하기 전에 도형의 겉 라인을 먼저 따야 함
    // 사각형 2개를 먼저 생각해보면, 일단 내부를 모두 1로 채우고, 겉 라인을 모두 2로 다시 만들면
    for(auto rect : rectangle) {
        int x1 = rect[0] * 2;
        int y1 = rect[1] * 2;
        int x2 = rect[2] * 2;
        int y2 = rect[3] * 2;
        
        for(int y = y1; y <= y2; y++) {
            for(int x = x1; x <= x2; x++) {
                board[y][x] = 1;
            }
            
        }
        
    }
    
    for(auto rect : rectangle) {
        int x1 = rect[0] * 2;
        int y1 = rect[1] * 2;
        int x2 = rect[2] * 2;
        int y2 = rect[3] * 2;

        for(int y = y1 + 1; y < y2; y++) {
            for(int x = x1 + 1; x < x2; x++) {
                board[y][x] = 2;
            }
        }
    }
    
    bfs(characterX *2, characterY*2, itemX *2,  itemY *2);
    answer = dist[itemY *2][itemX *2] /2;
    
    return answer;
}