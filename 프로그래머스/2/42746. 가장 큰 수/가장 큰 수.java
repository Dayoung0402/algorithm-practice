import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] numbers) throws Exception{
        
        String answer = "";
        int length_num = numbers.length; // 배열의 원소의 개수
        String array[] = new String[length_num];
        
        // int 배열을 String 배열로 변환
        for(int i = 0; i < length_num; i++) {
            array[i] = String.valueOf(numbers[i]);
        }
        
        // 정렬
        Arrays.sort(array, (a,b) -> (b + a).compareTo(a + b));
        
        // 이어 붙이기
        if(array[0].equals("0")) answer = "0";
        
        else {
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < length_num; i++) {
                sb.append(array[i]);
            }
            
            answer = sb.toString();
        } 
        
        return answer;
    }
}