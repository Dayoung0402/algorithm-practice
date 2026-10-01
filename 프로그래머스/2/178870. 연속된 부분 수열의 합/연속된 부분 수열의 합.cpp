#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> sequence, int k) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<int> answer;
    map<int, int> m;
    
    int left = 0; // 왼쪽 포인터
    int right = 0; //오른쪽 포인터
    int check = sequence[0];
    
    while(right < sequence.size()) {
            if(check == k) {
                m[left] = right;
                check -= sequence[left];
                left++;
            }
            else if(check < k){
                 right++;
                if(right < sequence.size()) {
                    check += sequence[right];
                }
            }
            else {
                check -= sequence[left];
                left++;
            }
    }  
    
    int min = INT_MAX;
    int one, two;
    
    for (const auto& [key, value] : m) {
        int check = value - key;
        if(check < min) {
            min = check;
            one = key;
            two = value;
        }
    }   
    answer.push_back(one);
    answer.push_back(two);
    
    return answer;
}