#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(string name) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0;
    int n_name = name.size(); //문자열 길이 
    
    /*
    전체 흐름 : 알파벳 이동이랑 위치 이동이랑 나눠서 생각해야 함
    */
    
    // 먼저 알파벳 이동
    for(int i = 0; i < n_name; i++) {
        int check = name[i];
        int a_up = check - 65;
        int z_down = 90 - check + 1;
        
        //a에서 올라가는 거랑, z로 가서 내려가는 것중 작은 거 
        if(a_up < z_down) {
            answer+= a_up;
        } else answer+= z_down;
    }
    
    //이제 위치 이동
    // 위치 이동은 다른 경우는 ㄱㅊ은데, AA 이렇게 A가 연속할 경우 고민 (A단독이면 상관없음)
    int min_m = n_name - 1; //그냥 직진인 경우
    
    for(int i = 0; i < n_name ; i++) {
        int next_index = i + 1;
        
        while(next_index < n_name && name[next_index] == 'A') {
            next_index++; // AA---A처럼 A의 끝까지 index를 옮겨두고
        }
        
        min_m = min(min_m, (n_name - next_index) *2 + i);
        min_m = min(min_m, i*2 + (n_name - next_index));
        
    }
    
    answer += min_m;
    return answer;
}