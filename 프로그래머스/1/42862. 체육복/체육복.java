import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) throws Exception {
        
        // 일단 여벌 체육복을 가져온 학생 중에서 도난 당한 경우
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < reserve.length; i++) {
            set.add(reserve[i]);
        } // reserve 배열 원소들을 set에 넣고
        
        for(int i = 0; i < lost.length; i++) {
            if(set.contains(lost[i])) {
                set.remove(lost[i]);
                lost[i] = 0;
            }
        } // lost에도 존재하는 reserve 배열 원소들을 제거하고
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) {
            
            int checkAdd = lost[i] - 1;
            int checkBack = lost[i] + 1;
            
            if(set.contains(checkAdd)) {
                lost[i] = 0;
                set.remove(checkAdd);
            } 
            else if(set.contains(checkBack)) {
                lost[i] = 0;
                set.remove(checkBack);
            }
        }
        
        int count = 0;
        for(int nunZero : lost) {
            if(nunZero != 0) count++;
        }
        
        int answer = n - count;
        
        
        return answer;
    }
}