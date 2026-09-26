#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

string solution(string number, int k) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    string answer = "";
    stack<int> s;
    int len = number.size();
    s.push(number[0]);
    int chance = k; //뺄 수 있는 기회 k
    
    for(int i = 1; i < len; i++) {
        while(!s.empty() && chance > 0 && s.top() < number[i]) { // 1 < 9 
            s.pop();
            chance--;
        }
        s.push(number[i]);
    }
    
    //만약 끝까지 갔더라도 k를 모두 못 빨 수 있으니 뒤에서 삭제
    while( chance  > 0) {
        s.pop();
        chance--;
    }
    
    while(!s.empty()) {
        int input = s.top();
        answer+= input;
        s.pop();
    }
    
    reverse(answer.begin(), answer.end());
    
    
    
    
    return answer;
}