package Thirty_Days_Of_Code;

import java.io.*;
public class IntroToConditionalStatements {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        if(n % 2 != 0){
            System.out.println("Weird");
        }
        else if(n >= 2 && n <= 5){
            System.out.println("Not Weird");
        }
        else if(n >= 6 && n <= 20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
        
}
