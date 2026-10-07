#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> scoville, int K) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    
    priority_queue<int, vector<int>, greater<int>> pq;
    
    for(int i = 0; i < scoville.size(); i++) {
        pq.push(scoville[i]);
    }
    
    while(!pq.empty()) {
        
        if(pq.top() >= K) {
            break;
        }
        
        if(pq.size() < 2) {
            return -1;
        }
        
        int check = pq.top();
        pq.pop();
        if(check < K) {
            int next = pq.top();
            pq.pop();
            pq.push(check + next*2);
            answer++;
        } else {
            pq.pop();
        }
    }
    
    return answer;
}