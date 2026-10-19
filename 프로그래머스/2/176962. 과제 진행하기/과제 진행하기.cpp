#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<string> solution(vector<vector<string>> plans) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<string> answer; // 최종답
    int count_p = plans.size(); // 수업의 개수
    
    // 일단 plans를 시작 시간이 빠른 걸 기준으로 정렬
    sort(plans.begin(), plans.end(),
        [](const vector<string>& a, const vector<string>& b) {
           return a[1] < b[1]; 
        });

    stack<pair<string, int>> st; // 작업 도중에 끊겨서 들어갈 큐 (멈춰둔 과제가 여러개이면 가장 최근거 가져오니깐)
    
    for(int i = 0; i < count_p-1; i++) {
   
        // 시작 시간을 모두 분 단위로 바꾸자 관리하기 쉽게
        int hour = stoi(plans[i][1].substr(0,2)); // 12
        int min = stoi(plans[i][1].substr(3,2)); // 20   
        int start = hour * 60 + min;
        
        int playtime = stoi(plans[i][2]);
        string name = plans[i][0];
        
        int n_hour = stoi(plans[i+1][1].substr(0,2)); // 12
        int n_min = stoi(plans[i+1][1].substr(3,2)); // 30   
        int n_start = n_hour * 60 + n_min;
        
        int ava = n_start - start;
        
        if(ava < playtime) { // 진행이 중간에 끊기는 상황 -> 스택에 들어가야 함
            st.push({name, playtime - ava});        
        } else { // 쭉~ 진행 가능
            answer.push_back(name);
            int remain = ava - playtime;
            
            while(!st.empty() && remain > 0) {
                
                // 가장 최근에 중단된 과제를 가져오기
                pair<string, int> check = st.top();
                st.pop();
                
                // 남은 시간 안에 완료할 수 있다면?
                if(check.second <= remain) {
                // -> answer에 추가하고 stack에서 제거
                    answer.push_back(check.first);
                    remain -= check.second;
                    
                } else {// 남은 시간 안에 완료할 수 없다면?
                    st.push({check.first, check.second - remain});
                    remain = 0;
                // -> 남은 수행 시간만 갱신
                }
            }
        }
    
    } 
    
    answer.push_back(plans[count_p - 1][0]);
    
    while(!st.empty()) {
        pair<string, int> out = st.top();
        answer.push_back(out.first);
        st.pop();
        
    }
    
    
    
    return answer;
}