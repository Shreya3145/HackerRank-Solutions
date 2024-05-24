import java.util.Scanner;
public class loops1 {
        public static void main(String[] args){
        int N;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}
