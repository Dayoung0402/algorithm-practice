#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<vector<int>> routes) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 1;
    
    // 도착 시간이 짧은 것으로 정렬
    sort(routes.begin(), routes.end(),
        [](const vector<int>& a, const vector<int>& b) {
            return a[1] < b[1];   
        }); //[-20,-15],[-18,-13],[-14,-5],[-5,-3]
    
    // 반복문을 돌면서 단속용 카메라 업데이트
    int stand = routes[0][1];
    for(int i = 1; i < routes.size(); i++) {
        if(routes[i][0] > stand) {
            stand = routes[i][1];
            answer++;
        }
    }
    return answer;
}