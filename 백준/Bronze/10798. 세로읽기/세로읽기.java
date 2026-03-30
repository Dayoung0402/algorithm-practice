import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] array = new char[5][15];
        
        for(int i = 0; i < 5; i++) { // 배열에 집어 넣기
            String line = br.readLine();
            
            for(int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                array[i][j] = c;
            }
        }
        
        for(int k = 0; k < 15; k++) {
            for(int l = 0; l < 5; l++) {
                if(array[l][k] != '\0') {
                    System.out.print(array[l][k]);
                }
            }
        }
        
        
        
    }
}