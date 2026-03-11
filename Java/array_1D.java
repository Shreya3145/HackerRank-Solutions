import java.util.*;

public class array_1D {

    public static void main(String[] args) {
	   
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for(int i=0; i<=n-1;i++){
                a[i] = scan.nextInt();
            }
            scan.close();
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}