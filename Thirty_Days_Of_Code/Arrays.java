package Thirty_Days_Of_Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Arrays {
     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        for(int i = n-1; i >= 0; i--){
            System.out.print(arr.get(i) +" ");
        }
    }
}
