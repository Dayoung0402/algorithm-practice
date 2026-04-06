import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String attend = st.nextToken();
            
            if(attend.equals("enter")) {
                set.add(name);
            }
            else {
                set.remove(name);
            }
        
        }
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        for(String word : list) {
            System.out.println(word);
        }
        
        
    }
}