#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> common) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    bool flag = true; // 등비
    
    // 등차인지 등비인지 구별
    // 그런데 문제에서 등비 아니면 등차라고 했으니깐
    
    if(common[2] - common[1] == common[1] - common[0]) {
        flag = false; 
    }
    
    if(flag){
        int multi = common[1] / common[0];
        answer = common[common.size() -1] * multi;
    }else{
        int plus = common[1] - common[0];
        answer = common[common.size() -1] + plus;
    }
    return answer;
}