import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);
        try{
        int b = scan.nextInt();
        int h = scan.nextInt();
        if((b<=0||h<=0)){
            throw new Exception("Breadth and height must be positive");
            }  
        System.out.println(b*h); 
        }
        catch(Exception e){
            System.out.println(e); 
        }   
        }
}
