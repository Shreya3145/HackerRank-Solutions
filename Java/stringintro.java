import java.util.*;

public class stringintro {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length()); //finding the lengths and adding them
        char a =A.charAt(0);//checking lexicographically whether a is greater than b
        char b =B.charAt(0);
        if(a>b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String a1=A.substring(0,1).toUpperCase()+A.substring(1);//capitalize the 1st letter
        String b1=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(a1+ " " +b1);
        sc.close();
        
    }
}
