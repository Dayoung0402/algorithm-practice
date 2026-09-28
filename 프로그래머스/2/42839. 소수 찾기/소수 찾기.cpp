#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int answer = 0;
int len;
bool visited[7+1];

vector<string> v;
set<int> s;
string cur = "";

void dfs(string cur) {
    if(!cur.empty()) {
        s.insert(stoi(cur));
    }
    
    for(int i = 0; i < len; i++) {
        if(!visited[i]) {
            visited[i] = true;
            dfs(cur + v[i]);
            visited[i] = false;
        }
    }  
}

void ifnum(int num){ //소수 판별
    
    if(num == 2) {
        answer++;
    } else if(num >2) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return;
            }
            else {
                if(i == num-1) {
                    answer++;
                }
            }
        }
    }
}

int solution(string numbers) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    len = numbers.size();
    
    for(int i = 0; i < len; i++) { 
        v.push_back(string(1, numbers[i]));
    } 
    // [1,7] [1,2,3]
    
    dfs("");
    
    for(int num : s) {
        ifnum(num);
    } 
    
    
    return answer;
}