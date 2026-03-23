import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine()); // 원소의 개수
        
        int[] array = new int[arraySize];
        int[] result = new int[arraySize];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 배열 안에 차례차례 집어넣음!!
        for(int i = 0; i < arraySize; i++) { 
            int input = Integer.parseInt(st.nextToken());
            array[i] = input;
        }
        
        // 원소의 개수 집계
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arraySize; i++) {
            int input = map.getOrDefault(array[i], 0) + 1;
            map.put(array[i], input);
        }
        
        // 오른쪽 탐색 -> 스택 이용
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arraySize; i++) {
            while (!stack.isEmpty() && map.get(array[stack.peek()]) < map.get(array[i])) {
                result[stack.pop()] = array[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        
        // 결론 출력 부분
        StringBuilder sb = new StringBuilder();
        for(int a = 0; a < arraySize; a++) {
            sb.append(result[a]).append(" ");
        }
        
        System.out.println(sb);
        
        
    }
}