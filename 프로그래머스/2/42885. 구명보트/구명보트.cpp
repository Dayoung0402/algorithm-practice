#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> people, int limit) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    int left = 0; // 왼쪽 포인터
    int right = people.size() - 1; // 오른쪽 포인터
    
    sort(people.begin(), people.end()); // [50,50,70,80]
    
    while(left <= right) {
        if(people[left] + people[right] > limit) {
            right--;
        } else {
            left++;
            right--;
        }
        answer++;
    }
          
    return answer;
}