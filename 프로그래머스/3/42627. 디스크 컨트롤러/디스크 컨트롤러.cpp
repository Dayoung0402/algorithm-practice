#include <string>
#include <vector>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<vector<int>> jobs) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int answer = 0; // 최종 답인 : 모든 요청 작업의 반환 시간
    int time = 0; // 현재의 시간 (x축)
    int index = 0; // 작업이 들어간 최근의 테스크 번호
    int count_j = jobs.size(); // 작업 대상의 테스크 수, 여기서는 3
    int done = 0; // 작업이 끝난 테스크 수
    
    // 작은 순 우선순위 큐 필요
    priority_queue<
        vector<int>,
        vector<vector<int>>,
        greater<vector<int>>
            > pq;
    // 도착 시간이 작은 순서대로 jobs들 정렬시키고
    sort(jobs.begin(), jobs.end());
    
    while(done < count_j) { // 모든 작업이 다 완료할 때까지
        
        while(index < count_j && jobs[index][0] <= time) { // 작업 개수가 아직 안 채워지고 + 현재 시간보다 앞에 도착
            pq.push({jobs[index][1], jobs[index][0]});
            index++;
        }
        
        if(!pq.empty()) { // 큐 안에 처리할 수 있는 테스크가 있을 때
            vector<int> check = pq.top(); // 만약 [3,0]
            pq.pop(); // 빼버리고
            time += check[0]; // 작업 시간 만큼 현재 시간 늘리고
            answer += time - check[1]; // 대기했던 시간 만큼 answer에 더하고
            done++;
            
        } else { // 테스트가 없으면
            time = jobs[index][0]; // 작업 대상이 없으면 그 다음 순서(인덱스)의 작업 들어온 시간으로 현재 시간을 초기화
        }
        
    }
    
    
    return answer / count_j;
}