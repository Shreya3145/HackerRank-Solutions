package Thirty_Days_Of_Code;

import java.util.*;
class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);    
    }
}
class Calculator{
    static void checkNumberNegative(int num1, int num2) throws NegativeNumberException{
        if(num1 < 0 || num2 < 0){
            throw new NegativeNumberException("n and p should be non-negative");
        }
        
    }
    public int power(int n, int p) throws NegativeNumberException{
        checkNumberNegative(n, p);
        int ans = 1;
        for(int i = 0; i < p; i++){
            ans *= n;
        }
        return ans;
    }
}
//Write your code here

class MoreExceptions{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

}
