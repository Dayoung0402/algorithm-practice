#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
bool visited[50+1];
int answer;

bool ifonediff(string first, string second) {
    int count = 0;
    for(int i = 0; i < first.size(); i++) {
        if(first[i] != second[i]) {
            count++;
        }
    }
    
    if(count == 1) {
        return true;
    } else {
        return false;
    }
}

void dfs(string begin, string target, vector<string> words, int depth) {
    
    if(begin == target) {
        answer = depth;
        return;
    }
    
    for(int i = 0; i < words.size(); i++) {
        if(!visited[i] && ifonediff(begin, words[i])) {
            visited[i] = true;
            string next = words[i];
            dfs(next, target, words, depth + 1);
            visited[i] = false;
        }
    }
}

int solution(string begin, string target, vector<string> words) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    dfs(begin, target, words, 0);
    
    return answer;
}