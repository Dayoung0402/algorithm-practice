import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] nums) throws Exception{
        int answer = 0;
        int size = nums.length; // 배열의 크기
        int goal = size / 2;
        
        // 받은 배열을 모두 집합에 넣고
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < size; i++) {
            set.add(nums[i]);
        }
        
        if(goal == set.size() || goal < set.size()) {
            answer = goal;
        }
        else if(goal > set.size()) {
            answer = set.size();
        }
        
        return answer;
    }
}