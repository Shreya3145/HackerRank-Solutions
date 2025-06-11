import java.util.*;

public class reverseString{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        String revStr = "";
        
        for(int i = A.length()-1; i >= 0; i--){
            revStr += A.charAt(i);   
        }
        
        if(A.contains(revStr)){
            System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
        
    }
}



