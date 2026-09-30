#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<int> answer;
    int len = progresses.size();
    
    vector<int> days;
    for(int i = 0; i < len; i++) {
        int day = (100 - progresses[i]) % speeds[i];
        if(day == 0) {
            days.push_back((100 - progresses[i]) / speeds[i]); // 7
        }else {
            days.push_back((100 - progresses[i]) / speeds[i] + 1); // 3
        }
    } // 반복문이 다 돌면 [7,3,9] 필요한 작업 일수가 담긴다.
    
    // [7,3,9] -> [2,1]
    // [5,10,1,1,20,1] -> [1,3,2]
    
    int standard = days[0];
    int count = 1;
    
    for(int i = 1 ; i < len; i++) { // 3 -> 4
        if(standard < days[i]) {
            standard = days[i];
            answer.push_back(count);
            count = 1; // 다시 1로 초기화
        }
        else { // 7 -> 3
            count++;            
        }
    }
    
    answer.push_back(count);
    
    
    
    
    return answer;
}