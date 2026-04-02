import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int number1 = Integer.parseInt(br.readLine());       
        Set<Integer> set = new HashSet<>();
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < number1; i++) {
           set.add(Integer.parseInt(st1.nextToken()));           
        }
        
        int number2 = Integer.parseInt(br.readLine());       
        int[] array = new int[number2];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < number2; i++) {
           array[i] = Integer.parseInt(st2.nextToken());           
        }
        
       for(int i = 0; i < number2; i++) {
           if(set.contains(array[i])){
               System.out.println(1);
           }
           else System.out.println(0);
        } 
        
        
        
    }
}