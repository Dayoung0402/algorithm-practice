#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<int> answer;
    
    // 남은 날짜 수 계산 
    vector<int> days;
    for(int i = 0; i < progresses.size(); i++) {
        int remain = 100 - progresses[i];
        if(remain % speeds[i] == 0) {
            days.push_back((remain / speeds[i]));
        } else days.push_back((remain / speeds[i]) + 1);
    }
    
    stack<int> st;
    for(int i = progresses.size()-1; i >= 0; i--) {
        st.push(days[i]);
    } // 9,3,7순서로 스택에 넣고
    
    while(!st.empty()) {
        
        int count = 1;
        int check = st.top();
        st.pop();
        
        while(!st.empty() && check >= st.top()) {
            count++;
            st.pop();
        }
        
        answer.push_back(count);
    }
    
    
    return answer;
}