#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int answer = INT_MAX;

int diamond(vector<int>& min_num, int fatigue, int index) {
    for(int i = index; i < min(index + 5, (int)min_num.size()); i++) {
        fatigue++;
    }
    return fatigue;
}

int iron(vector<int>& min_num, int fatigue, int index) {
    for(int i = index; i <  min(index + 5, (int)(min_num.size())); i++) {
        if(min_num[i] == 3) {
            fatigue += 5;
        } else fatigue++;
    }
    
    return fatigue;
    
}

int stone(vector<int>& min_num, int fatigue, int index) {
    for(int i = index; i < min(index + 5, (int)min_num.size()); i++) {
        if(min_num[i] == 3) {
            fatigue += 25;
        } else if(min_num[i] == 2) {
            fatigue += 5;
        } else fatigue++;
    }
    
    return fatigue;
    
}

void dfs(vector<int>& picks, vector<int>& min_num, int fatigue, int index) {
    
    if(index >= min_num.size() || (picks[0] == 0 && picks[1] == 0 && picks[2] == 0)) { // 광물을 모두 탐색했거나, 무기를 소진했을 때
        answer = min(answer, fatigue);
        return;
    }
    
    for(int i = 0; i < 3; i++) {
        
        int next_fatigue = fatigue;
        
        if(picks[i] > 0) {
            picks[i]--;
            
            if(i == 0) { next_fatigue = diamond(min_num, fatigue, index);} // 다이아 선택
            else if(i == 1) { next_fatigue = iron(min_num, fatigue, index);} // 철 선택
            else {next_fatigue = stone(min_num, fatigue, index);} // 돌 선택
            
            dfs(picks, min_num, next_fatigue, index + 5);
            
            picks[i]++;
            
        }
    }
    
    
    
}

int solution(vector<int> picks, vector<string> minerals) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    
    // 광물들 전부 숫자로 바꿔서
    vector<int> min_num;
    for(string target : minerals) {
        if(target == "diamond") {min_num.push_back(3);}
        else if(target == "iron") {min_num.push_back(2);}
        else {min_num.push_back(1);}
    } // 3,3,3,2,2,3,2,1
    
    //이후 전체 로직
    /*
    1. 다이다/철/돌 무기를 선택했을 때 피로도 갱신 함수 만들고
    2. dfs로 그 피로도 중 최선을 고르기
    */
    
    dfs(picks, min_num, 0, 0);
    
    return answer;
}