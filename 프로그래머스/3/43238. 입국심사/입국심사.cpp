#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

long long solution(int n, vector<int> times) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    long long answer = 0;
    
    long long left = 1;
    long long right = 1LL * (*min_element(times.begin(), times.end())) * n; // 7 X 6 = 42
    
    while(left <= right) {
        
        long long mid = left + (right - left)/2;
        long long count = 0;
        
        for(int i = 0; i < times.size(); i++) {
            count += mid/times[i];
            
            if(count >= n) {
                break;
            }
        }
        
        if(count >= n) {
            answer = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        
    }
    
    return answer;
}