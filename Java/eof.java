import java.util.Scanner;
public class eof {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String a =scan.nextLine();
        int i=1;
        System.out.println(i+" "+a);
        while(scan.hasNext()){
            String b = scan.nextLine();
        if(b.isEmpty()){
            break;
        }
        System.out.println(i+1+" "+b);
            i++;
        }
    }
}
