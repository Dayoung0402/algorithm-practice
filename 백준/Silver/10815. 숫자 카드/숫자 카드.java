import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sangun = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < sangun; i++) {
            set.add(Integer.parseInt(st1.nextToken()));
        }
        
        int check = Integer.parseInt(br.readLine());
        int[] result = new int[check];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < check; i++) {
            if(set.contains(Integer.parseInt(st2.nextToken()))) {
                result[i] = 1;
            }
            else result[i] = 0;
        }
        
        for(int i = 0; i < check; i++) {
            if(i != check -1) System.out.print(result[i] + " ");
            else if(i == check -1) System.out.print(result[i]);
        }
    }
}