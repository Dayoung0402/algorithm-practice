import java.util.*;
import java.io.*;


class Solution {
    public int[] solution(int[] answers) {
        
        // 1번 : 1,2,3,4,5 반복 -> 크기 5
        // 2번 : 2,1,2,3,2,4,2,5 반복 -> 크기 8
        // 3번 : 33,11,22,44,55 반복 -> 크기 10
        int length_an = answers.length; // 문제 수 가져오고
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        for(int i = 0; i < length_an; i++) {
            if((i+1)%5 == 1) {
                if(answers[i] == 1) num1++; }
            else if((i+1)%5 == 2) {
                if(answers[i] == 2) num1++; }
            else if((i+1)%5 == 3) {
                if(answers[i] == 3) num1++; }
            else if((i+1)%5 == 4) {
                if(answers[i] == 4) num1++; }
            else if((i+1)%5 == 0) {
                if(answers[i] == 5) num1++; }
        }
        
        for(int i = 0; i < length_an; i++) {
            if((i+1)%2 == 1) {
                if(answers[i] == 2) num2++;}
            else {
                if(((i+1)%8 == 2) && answers[i] == 1 ) num2++;
                else if(((i+1)%8 == 4) && answers[i] == 3 ) num2++;
                else if(((i+1)%8 == 6) && answers[i] == 4 ) num2++;
                else if(((i+1)%8 == 0) && answers[i] == 5 ) num2++;
            }
        }
        
        for(int i = 0; i < length_an; i++) {
            if((i+1)%2 == 1) {
                if(((i+1)%10 == 1) && answers[i] == 3) num3++;
                if(((i+1)%10 == 3) && answers[i] == 1) num3++;
                if(((i+1)%10 == 5) && answers[i] == 2) num3++;
                if(((i+1)%10 == 7) && answers[i] == 4) num3++;
                if(((i+1)%10 == 9) && answers[i] == 5) num3++;
            }
            
            else if((i+1)%2 == 0) {
                if(((i+1)%10 == 2) && answers[i] == 3) num3++;
                if(((i+1)%10 == 4) && answers[i] == 1) num3++;
                if(((i+1)%10 == 6) && answers[i] == 2) num3++;
                if(((i+1)%10 == 8) && answers[i] == 4) num3++;
                if(((i+1)%10 == 0) && answers[i] == 5) num3++;
            }
        }
        
        int[] score = {num1, num2, num3};
        int max = score[0];
        for(int i = 0; i < 3; i++) {
            if(max < score[i]) max = score[i];
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(max == score[i]) {
                list.add(i+1);
            }
        }
        
        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
                
        
        
        
        return array;
    }
}