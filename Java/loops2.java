import java.util.*;
public class loops2 {
    public static void main(String[] argh) {
        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int k = 0;
                for (int j = 0; j < n; j++) {
                    int c = (int) (Math.pow(2, j) * b);
                    System.out.print(a + k + c + " ");
                    k += c;
                }
                System.out.println();
            }
        }
    }
}
