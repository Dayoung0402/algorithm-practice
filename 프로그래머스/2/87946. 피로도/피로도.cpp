#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
bool visited[9];
multiset<int> ms;

void dfs(vector<vector<int>>& dungeons, int count, int k) {
    
    ms.insert(count);
    
    for(int i =0 ; i < dungeons.size(); i++) {
        
        int minus = dungeons[i][1]; // 그래서 빠지는 체력
        
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(dungeons, count + 1, k -  minus);
                visited[i] = false;
            }
    }
    
}

int solution(int k, vector<vector<int>> dungeons) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = -1;
    sort(dungeons.begin(), dungeons.end());
    
    // 최대한 많이~
    dfs(dungeons, 0, k); 

    answer = *ms.rbegin();
    
    return answer;
}