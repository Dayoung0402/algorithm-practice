import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] clothes) {
        
        int answer = 1; // 최종 반환 값
        int sizeOfCloth = clothes.length; // 총 가지고 있는 의상의 총 개수
        
        Map<String, Integer> map = new HashMap<>();     
        Stack<String> check = new Stack<>();
        
        // 종류별 의상의 count를 늘리고 
        for(int i = 0; i < sizeOfCloth; i++) { 
            String target = clothes[i][1];
            
            if(!map.containsKey(target)) {
                check.push(target);
            }
            
            map.put(target, map.getOrDefault(target,0) + 1);   
        }
        
        int sizeOfMap = map.size(); // map에 전체 몇 종류의 의상이 담겼는지 
        int[] array = new int[sizeOfMap];
        
        for(int i = 0; i < sizeOfMap; i++) {
            array[i] = map.get(check.pop());
        }
        
        for(int i = 0; i < sizeOfMap; i++) {
            answer *= (array[i] + 1);
        }
        
        return answer-1;
        
        
    }
}