package Thirty_Days_Of_Code;
public class BinaryNumbers {
    public String convertToBinary(int n) {
        String s = Integer.toString(n, 2);
        return s;
    }
    public int returnMaxConsecutives(String s){
        int count = 1, maxCount = 0;
        for(int i = 1; i <= s.length()-1 ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
    
}
