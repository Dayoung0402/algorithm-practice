#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

string solution(string number, int k) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    string answer = "";
    // 전체 흐름 정리
    /*
    1. 인덱스 0을 일단 스택에 넣고
    2. 인덱스 1부터는 앞서 스택 값들(바로 앞 값 뿐만 아니라 이전도)과 비교해서 
    -> 작거나 같으면 그냥 같다 붙이고
    -> 크면 기존 스택 값 빼고 갖다 붙임
    */
    stack<char> s;
    s.push(number[0]);
    int len = number.size();
    int chance = k;
    
    for(int i = 1; i < len; i++) {
        while(!s.empty() && chance > 0 && s.top() < number[i]) {
            s.pop();
            chance--;
        }
        s.push(number[i]);
    }
    
    while(chance > 0) { //다 돌았는데도 뺄게 없으면 걍 뒤에꺼 빼고
        s.pop();
        chance--;
    }
    
    while(!s.empty()) {
        answer += s.top();
        s.pop();
    }
    
    reverse(answer.begin(), answer.end());
    
    return answer;
}