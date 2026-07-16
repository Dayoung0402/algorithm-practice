class Solution {
    
    public static int recurNums(int[] numbers,int total, int index, int target) { 
        
        if(index == numbers.length) {
            if(total == target) {
                return 1;
            }
            return 0;
            
        }
        
        int plus = recurNums(numbers,total + numbers[index],index + 1,target);
        int minus = recurNums(numbers,total - numbers[index],index + 1,target);
        
        return plus + minus;
        
    }
    
    public int solution(int[] numbers, int target) {
        
        int answer = 0;
        int lengthOfNum = numbers.length;
        
        boolean flag = false;
        int total = 0;
        int index = 0;
        
        answer += recurNums(numbers,total, index, target);
        
        return answer;
    }
}