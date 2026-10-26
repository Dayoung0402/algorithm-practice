#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(int cacheSize, vector<string> cities) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    int cs = cacheSize;
    deque<string> dq;
    /* 전체 로직 (LRU)
    1. 가장 먼저 예외 처리인 캐시크기가 0이면 걍 5 X 도시 개수로 넣어버리고
    2. 그게 아니면
    - 1) hit일 경우에
    - 2) miss인 경우에
    */
    
    if(cs == 0) {
        answer = 5 * cities.size();
    } // 1번 경우
    else { // 2번으로 내려와서
        for(string city : cities) {
            
            for(char &c : city) { // 모두 소문자로 바꾸고
                c = tolower(c);
            }
            
            auto p = find(dq.begin(), dq.end(), city);
            
            // hit 일 때
            if(p != dq.end()) {
                dq.erase(p);
                dq.push_back(city);
                answer ++;
            } else { //miss 인 경우
                
                // 큐의 크기가 찼을 때
                if(dq.size() >= cs) {
                    dq.pop_front();
                }
                
                dq.push_back(city);
                answer += 5;
            }
            
            
        }
    }
    return answer;
}