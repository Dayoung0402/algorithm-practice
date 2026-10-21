#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<string> operations) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<int> answer;
    int count = operations.size();
    priority_queue<int> pq;
    multiset<int> ms;
    
    for(int i = 0; i < count; i++) {
        string command = operations[i].substr(0,1);
        
        if(command == "I") { // 숫자 넣기
            int num = stoi(operations[i].substr(2));
            ms.insert(num);
        }
        else { // 삭제의 경우
            if(ms.empty()) {
                continue;
            }
            string check = operations[i].substr(2);
            if(check == "-1") { // 최솟값 삭제
                ms.erase(ms.begin());
            } else { // 최댓값 삭제
                auto it = ms.end();
                    --it;
                    if(!ms.empty()) {
                        ms.erase(it);
                    }
                
            }
        }        
        
    }
    
    if(ms.empty()) {
            return {0,0};
        } else {
            return {*ms.rbegin(),*ms.begin()};
        }
    
    return answer;
}