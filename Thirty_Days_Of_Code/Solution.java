package Thirty_Days_Of_Code;
import java.util.*;



class Difference {
  	private final int[] elements;
  	public int maximumDifference;
    
    Difference(int[] elements){
        this.elements= elements;
    }
    public void computeDifference(){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for(int num : elements){
        if(num > max)
            max = num;
        if(num < min)
            min = num;
    }
    
    maximumDifference = Math.abs(max - min);
}
    
	// Add your code here

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}