package Thirty_Days_Of_Code;

import java.io.*;




public class StringToInt {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String S = bufferedReader.readLine();
            try{
                int n = Integer.parseInt(S);
                System.out.println(n);
            }
            catch(NumberFormatException e){
                System.out.println("Bad String");
            }
        }    }
}

