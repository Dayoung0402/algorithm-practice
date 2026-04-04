import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st1.nextToken()); // 총 날짜 받고
        int group = Integer.parseInt(st1.nextToken()); // 몇 그룹으로 묶을지 받고
        int[] array = new int[days];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());       
        for(int i = 0; i < days; i++) { // 배열에 하나씩 넣고 저장
            array[i] = Integer.parseInt(st2.nextToken());
        }
        
        int sum = 0;
        for(int i = 0; i < group; i++) { // 가장 먼저 첫번째 묶음의 합을 구하고 
            sum += array[i];
        }
        
        int max = sum; // 일단 첫번째 묶음이 최대값일테니 max에 넣고
        int count = 1; // 최대값 묶음 횟수
        
        for(int i = 0; i < days - group; i++) { // 슬라이딩 윈도우로 합의 최대를 갱신
            sum = sum - array[i] + array[i + group]; // 바로 이전꺼 빼고 새로 더하고
            if(sum > max) {
                max = sum;
                count = 1;
            } 
            else if(sum == max) count++;
        }
        
        if(max == 0) System.out.println("SAD");
        else {
            System.out.println(max);
            System.out.println(count);
        }
        
    }
}