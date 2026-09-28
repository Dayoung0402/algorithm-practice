#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> citations) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int answer = 0;
    
    sort(citations.begin(), citations.end()); // [0,1,3,5,6]
    
    int len = citations.size();
    vector<int> compare;
    for(int i = 0; i < len; i++) {
        compare.push_back(len-i); // [5,4,3,2,1]
    }
    
    for(int i = 0; i < len; i++) {
        if(citations[i] >= compare[i]) {
            int check = compare[i];
            
            if(check >= answer) {
                answer = check;
            }
        }
    }
    
    return answer;
}