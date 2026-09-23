#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<string> answer;
    
    vector<pair<char, string>> v;
    for(int i = 0; i < strings.size(); i++) {
        string target = strings[i];
        v.push_back({target[n], strings[i]}); // {u,sun}, {e, bed} , {a, car} 
    }
    
    sort(v.begin(), v.end());
    
    for(int i = 0; i < strings.size(); i++) {
        answer.push_back(v[i].second);
    }
    return answer;
}