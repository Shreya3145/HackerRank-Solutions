package Thirty_Days_Of_Code;
import java.util.*;


public class LetsReview {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < n; i++){
                String s = sc.nextLine();
                separateEvenAndOdd(s);
                System.out.println();
            }
        }
    
    }
    public static void separateEvenAndOdd(String s){
        int len = s.length();
        
        for(int i = 0; i < len; i++){
            if(i % 2 == 0)
                System.out.print(s.charAt(i));
        } 
        System.out.print(" ");
        
        for(int i = 0; i < len; i++){
            if(i % 2 != 0)
                System.out.print(s.charAt(i));
        }
    }
}