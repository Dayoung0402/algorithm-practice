import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception {
        
        int total = 1;
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 3; i++) {
            total *= Integer.parseInt(br.readLine());
        } // 3개의 숫자를 곱함
        
        char[] array = String.valueOf(total).toCharArray(); // 숫자 -> 문자열 -> 문자배열
        
        for(int j = 0; j < array.length; j++) {
            if(array[j] == '0') zero++;
            else if(array[j] == '1') one++;
            else if(array[j] == '2') two++;
            else if(array[j] == '3') three++;
            else if(array[j] == '4') four++;
            else if(array[j] == '5') five++;
            else if(array[j] == '6') six++;
            else if(array[j] == '7') seven++;
            else if(array[j] == '8') eight++;
            else if(array[j] == '9') nine++;
        }
        
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}