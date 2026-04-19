import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) throws Exception{
        
        int[] answer = new int[commands.length]; // 총 정답의 개수가 commands의 길이 (문제 : 3)
        
        for(int i = 0; i < commands.length; i++) { 
            
            int head = commands[i][0]; // 실제 시작 인덱스 + 1
            int tail = commands[i][1]; // 실제 끝 인덱스 + 1
            int order = commands[i][2]; // k번째 숫자
            
            int[] example = new int[tail - head + 1];
            for(int j = 0; j < tail - head + 1; j++) {
                example[j] = array[j + head - 1];
            }
            
            Arrays.sort(example);
            
            answer[i] = example[order - 1];
        }
        
        return answer;
    }
}