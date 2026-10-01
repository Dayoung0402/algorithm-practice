#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(int bridge_length, int weight, vector<int> truck_weights) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0; // 시간
    int current = 0; // 현재 다리의 무게
    int index = 0; // 다리에 올라올 다음 대기 트럭 인덱스
    queue<int> q;
    
    for(int i = 0; i < bridge_length; i++) {
        q.push(0);
    }
    
    while(index < truck_weights.size() || current > 0) {
        
        current -= q.front();
        q.pop();
        
        // 아직 대기 트럭이 남았을 때
        if(index < truck_weights.size()){
            // 무게가 초과하지 않을 때
            if(current + truck_weights[index] <= weight){
                current += truck_weights[index];
                q.push(truck_weights[index]);
                index++;               
            } else { // 무게가 초과해서 그냥 시간 때우고
                q.push(0);
            }
        }
        else{
            q.push(0);
            }
        answer++;
        
    }
    return answer;
}