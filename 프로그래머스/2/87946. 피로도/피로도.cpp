#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
bool visited[8+1];
multiset<int> ms;

void dfs(int count, int k, vector<vector<int>> dungeons) {
    
    ms.insert(count);
    
    for(int i = 0; i < dungeons.size(); i++) {
        if(!visited[i] && k >= dungeons[i][0]) {
            visited[i] = true;
            dfs(count + 1, k - dungeons[i][1], dungeons);
            visited[i] = false;
        }
    }
}

int solution(int k, vector<vector<int>> dungeons) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = -1;
    
    sort(dungeons.begin(), dungeons.end());
    
    dfs(0, k, dungeons);
    
    answer = *ms.rbegin();
    
    return answer;
}