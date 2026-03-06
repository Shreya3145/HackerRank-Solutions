package Thirty_Days_Of_Code;

public class Operators {
   

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    double tip = meal_cost * tip_percent / 100;
    double tax = tax_percent * meal_cost / 100;
    double total_cost = meal_cost + tip +  tax;
    System.out.println(Math.round(total_cost));
    }

}
