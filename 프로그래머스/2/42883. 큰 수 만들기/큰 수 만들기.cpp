#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

string solution(string number, int k) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    string answer = "";
    
    // 스택 이용 : 마주한 숫자가 담아 놓은 숫자보다 크면 담아 놓은 숫자를 버린다.
    stack<char> s;
    s.push(number[0]); // 일단 첫번째 1 넣고
    int chance = k;
    
    for(int i = 1; i < number.size(); i++) {
            
        while(!s.empty() && chance > 0 && s.top() < number[i]) { // 9가 1보다 크니깐 9를 스택에 집어넣고 chance 하나 줄이고
            s.pop();
            chance--;
        }
        s.push(number[i]);
    }
    
    while(chance > 0) {
        s.pop();
        chance--;
    }
    
    int size_s = s.size();
    for(int i = 0; i < size_s; i++) {
            answer += (s.top());
            s.pop();
        }
    
    reverse(answer.begin(), answer.end());
    
    return answer;
}