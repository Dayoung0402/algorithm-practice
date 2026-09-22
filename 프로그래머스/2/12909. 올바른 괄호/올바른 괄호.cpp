#include<string>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

bool solution(string s){
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    bool answer = true;
    
    // (가 먼저 나올때랑, )가 먼저 나올때 구분해서 생각해보면
    // 일단 (가 나오면 뒤도 안 돌아보고 false 
    // 그런데 )가 나오면 생각 좀 해봐야함
    
    stack<char> stack;
    
    for(int i = 0; i < s.size(); i++) {

        if(s[i] == '(') {
            stack.push(s[i]); // 일단 (가 나오면 저장
        } else {
            if(!stack.empty()) {
                stack.pop();
            } else return false;
        }    
    }
    
    if(!stack.empty()) answer = false;
    return answer;
    
}