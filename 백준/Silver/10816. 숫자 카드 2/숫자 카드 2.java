import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        int sangun = Integer.parseInt(br.readLine());        
        int[] arrayOne = new int[sangun];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < sangun; i++) {
            arrayOne[i] = Integer.parseInt(st1.nextToken());
        } // 일단 상근이가 가진 숫자들 배열에 집어넣고
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arrayOne) {
            map.put(num, map.getOrDefault(num,0) + 1);
        } // 상근이의 배열에서 각 원소가 몇개 있는 지 확인하고 map에 반영
        
        int check = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < check; i++) {
            int number = Integer.parseInt(st2.nextToken());
            sb.append(map.getOrDefault(number,0)).append(" ");
        } // 확인 객체인 숫자들 배열에 집어넣고 바로 map 확인해서 출력
        
        System.out.println(sb);
        
         
    }
}