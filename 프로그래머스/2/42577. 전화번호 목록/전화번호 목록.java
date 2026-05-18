import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 배열을 길이 기반으로 정렬 
        Arrays.sort(phone_book, (a,b) -> a.length() - b.length());
        
        // for문 이중 반복으로 
        // 자기보다 긴 문자열 대상으로 확인
        boolean flag = true;
        int array_len = phone_book.length; // 배열의 길이
        Arrays.sort(phone_book); // 사전식으로 정렬
        
        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])) {
            answer = false;
            break;
            }
        }       
        
        return answer;
    }
}