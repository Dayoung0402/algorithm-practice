import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); // efeEFfe 입력 받음
        line = line.toLowerCase(); // 문자열을 모두 소문자로 변경 efeeffe
        char[] array = new char[line.length()];
        
        // 소문자로 모두 바꾼 문자열을 배열에 하나씩 집어넣음
        for(int i = 0 ; i <line.length(); i++) {
            array[i] = line.charAt(i);
        }
        
        // map에 원소-개수 구조로 넣음
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0; j < line.length(); j++) {
            int input = map.getOrDefault(array[j], 0) + 1;
            map.put(array[j], input);
        }
        
        // 어떤 원소가 가장 많은 지
        char key = '?';
        int max = 0;
        boolean duplicatedFlag = false; // 동일 개수 존재 판단 플래그
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
                duplicatedFlag = false; // 플래그 다시 초기화
            }
            else if(entry.getValue() == max) {
                duplicatedFlag = true;
            }
        }
        
        if(duplicatedFlag) System.out.print("?");
        else System.out.print(Character.toUpperCase(key));
        
    }
}