#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<vector<int>> routes) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 1; // 최종 답인 카메라의 개수. 일단 1로 초기화
    
    // 각 차량의 끝 구간을 기준으로 정렬
    sort(routes.begin(), routes.end(),
        [](const vector<int>& a, const vector<int>& b) {
            return a[1] < b[1];
        }); // 이렇게 정렬을 마치면 [-20,-15], [-18,-13], [-14,-5], [-5,-3]
    
    int stand = routes[0][1]; // 가장 먼저 15가 기준이 됨
    
    for(int i = 1; i < routes.size(); i++) {
        int check = routes[i][0];
        if(check > stand) {
            stand = routes[i][1];
            answer++;       
        }
    }
    
    return answer;
}