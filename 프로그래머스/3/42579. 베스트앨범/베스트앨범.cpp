#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<string> genres, vector<int> plays) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    // 뭐가 필요할까... 생각중... 
    vector<int> answer;
    
    // 장르 각각 재생된 곡수들 대응되게 
    map<string, int> m; // {classic, 1450} {pop, 3100}
    for(int i = 0; i < genres.size(); i++) {
        m[genres[i]] += plays[i];
    }
    
    //value기준으로 정렬 
    vector<pair<string, int>> v(m.begin(), m.end());
    sort(v.begin(), v.end(), [](auto a, auto b) {
        return a.second > b.second;
    });
    
    int num_genre = m.size(); // 2 , {pop, 3100} {classic, 1450}
    
    vector<pair<pair<string, int>, int>> couple; // {{classic, 500},1} ,{{pop, 600},2} 이렇게 벡터에 저장됨
    for(int i = 0; i < genres.size(); i++) {
        couple.push_back({{genres[i], plays[i]},i}); 
    }
    
    sort(couple.begin(), couple.end(), // 재생수대로 정렬
         [](const auto&a, const auto&b) {
             if(a.first.second == b.first.second) {
                 return a.second < b.second;
             }
             return a.first.second > b.first.second;
        
    });
    
    for(int i = 0; i < num_genre; i++) {
        string target = v[i].first; //classic
        int count = 0;
        
        for(int j = 0; j < couple.size(); j++) {
            if(couple[j].first.first == target) {
                int index = couple[j].second;
                
                answer.push_back(index);
            
                count++;
                if(count == 2) {
                    break;
                }
            }
        }

        
    }

    return answer;
}