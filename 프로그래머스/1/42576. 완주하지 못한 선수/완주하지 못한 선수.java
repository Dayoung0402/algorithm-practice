import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) throws Exception{
        
        // participant, completion 에서는 동명이인이 존재할 수 있음. 즉 중복 가능 이름 고려해야 함
        // 이걸 어떻게 잘 퓰꺼.....
        // 배열에 원소를 담아서 일일히 검사하면 시간 복잡도가 N^2로 올라가서 안될 것 같고 hashmap사용
        
        Map<String, Integer> map = new HashMap<>(); // 참가인원을 넣을 map을 선언하고         
        
        // 참가인원들 모두 map에 넣고
        for(String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        } 
        
        // 실제인원에서 name 꺼내와서 map에서 처리
        for(String check : completion) {
            map.put(check, map.getOrDefault(check, 0) - 1);
        }
        
        // map에서 key가 0이 아닌 것 가져오고
        for(String key : map.keySet()) {
            if(map.getOrDefault(key, 0) != 0) return key;
        } 
        
        return "";
        
    }
}