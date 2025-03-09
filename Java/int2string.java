import java.util.Scanner;

public class int2string {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s = String.valueOf(a); //converting to string
        if(a==Integer.parseInt(s)) //checking that the value in string s is same as the value of a 
        System.out.println("Good job");
        else{
            System.out.println("Wrong answer");
        }
    }
}
