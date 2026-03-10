package Thirty_Days_Of_Code;


import java.util.HashMap;
import java.util.Scanner;

public class DictionariesAndMaps {
     public static void main(String []argh){
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            HashMap<String, Integer> phonebook = new HashMap<>();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                phonebook.put(name, phone);
            }
            while(in.hasNext()){
                String s = in.next();
                if(phonebook.containsKey(s)){ // if(phonebook.getOrDefault(s, 0) == 0) not safe
                    System.out.println("Not found");
                }
                else {
                    System.out.println(s + "=" + phonebook.get(s));
                }
            }
            in.close();
        }
    }
    
}
