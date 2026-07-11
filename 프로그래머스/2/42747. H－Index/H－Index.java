import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int sizeOfArr = citations.length;
        
        // 받은 배열을 일단 오름차순으로 정렬하고 
        Arrays.sort(citations);
        // 0 1 3 5 6
        
        for(int i = 0; i < sizeOfArr; i++) {
            if(citations[i] >= sizeOfArr - i) {
                answer = sizeOfArr - i;
                return answer;
            }
        }
        
        
        return 0;
    }
}