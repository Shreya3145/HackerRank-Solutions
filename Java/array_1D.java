import java.util.*;

public class array_1D {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
int[] a = new int[n];
for(int i=0; i<=n-1;i++){
    a[i] = scan.nextInt();
}
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}