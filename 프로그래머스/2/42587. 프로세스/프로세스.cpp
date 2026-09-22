#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> priorities, int location) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    
    queue<pair<int, int>> q; // {우선순위, 인덱스} -> {2,0} {1,1} {3,2} {2,3}
    priority_queue<pair<int, int>> pq; // 정렬된 큐 -> {3,2} {2,0} {2,3} {1,1}
    
    // 그냥 큐랑 정렬 큐 안에 사이좋게 넣고
    for(int i = 0; i < priorities.size(); i++) {
        q.push({priorities[i], i});
        pq.push({priorities[i], i});
    }
    
    // 큐에서 하나씩 꺼내서 
    while(!q.empty()) {
        int target_p = q.front().first; //pair 중 우선순위
        int target_i = q.front().second; //pair 중 인덱스
        q.pop(); // {2,0}이 빠져나오고
        
        //이제 이렇게 뺀거를 정렬 큐랑 비교
        if(target_p < pq.top().first) { //정렬 큐 맨위보다 작으면 아직 나올 수 없다는 거니깐
            q.push({ target_p, target_i}); //큐 뒤에 다시 넣고
        } else { // 가장 큰 우선 순위라는 거니깐
            pq.pop();
            answer++;
            if(location == target_i) {                
                return answer;
            }
        }
    }
        
    return 0;
}