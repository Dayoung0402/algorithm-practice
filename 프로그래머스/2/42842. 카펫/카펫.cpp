#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(int brown, int yellow) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<int> answer;
    
    int total = brown + yellow;
    
    // 갈색 격자의 최소 길이가 3
    for(int h = 3; h < total; h++) {
        if(total % h == 0) { // h로 넓이가 나눠지면 
            int w = total / h; // 그 나눠진 h에 대응되는 w
            if(w >= h) {
                if((w-2) * (h-2) == yellow) {
                    return {w,h};
                }
            }
        }
    }
}