import java.util.*;
import java.io.*;


class Solution {
    public int solution(int[][] sizes) {
        
        int[][] array = new int[sizes.length][2];
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] >= sizes[i][1]) {
                array[i][0] = sizes[i][1];
                array[i][1] = sizes[i][0];
            }
            
            else if(sizes[i][0] < sizes[i][1]) {
                array[i][0] = sizes[i][0];
                array[i][1] = sizes[i][1];
            }
        } // 정렬
        
        int max_one = array[0][0];
        int max_two = array[0][1];
        for(int i = 0; i < sizes.length; i++) {
            if(array[i][0] >= max_one) {
                max_one = array[i][0];
            }
            
            if(array[i][1] >= max_two) {
                max_two = array[i][1];
            }
        }
        
        int answer = max_one * max_two;
        
        
        
        
        return answer;
    }
}