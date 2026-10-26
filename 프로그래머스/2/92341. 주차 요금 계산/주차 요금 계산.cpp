#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> fees, vector<string> records) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<int> answer;
    /*
    차량번호가 key인 map인데 들어온 시간 기록하는 것 필요
    차량번호가 key인 map인데 누적 시간 기록하는 것 필요
    
    시간을 일단 쌓아두고 나중에 한꺼번에 바용으로 계산
    */
    map<string, int> in_time;
    map<string, int> total_time;
    
    for(string record : records) {
        
        string time, car_num, status;
        stringstream ss(record);
        ss >> time >> car_num >> status;
        
        stringstream sss(time);
        string h,m;
        getline(sss, h, ':');
        getline(sss, m, ':');
        
        int total = stoi(h) * 60 + stoi(m);
        
        if(status == "IN") { // 들어왔을 때
            in_time[car_num] = total;
        } else { // 나갈 때
            total_time[car_num] += (total - in_time[car_num]); // 누적 시간
            in_time.erase(car_num); // 원래의 들어온 시간 빼고
        } 
    }
    
    // 나감 처리가 없는 경우 -> 추가로 더해주고 
    for(auto& p: in_time) {
        string name = p.first;
        int time = p.second;
        
        total_time[name] += (23 * 60 + 59) - time;
    }
    
    // 이제 비용을 계산하면
    for(auto& p : total_time) {
        int time = p.second;
        
        if(time <= fees[0]) {
            answer.push_back(fees[1]);
        }
        else {
            int addtime = time - fees[0]; // 기본 시간을 제외한 시간
            if(addtime % fees[2] == 0) { // 시간이 딱 맞아 떨어지면 
                answer.push_back(fees[1] + (addtime / fees[2]) * fees[3]);
            } else { // 시간 +1을 해야 할 때
                answer.push_back(fees[1] + (addtime / fees[2] + 1) * fees[3]);
            }
        }
    }
    
    return answer;
}