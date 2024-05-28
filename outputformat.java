import java.util.*;
public class outputformat {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println(String.format("%-15s%03d", s1, x));
            }
            System.out.println("================================");
    }
}