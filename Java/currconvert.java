import java.text.*;
import java.util.*;

public class currconvert {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        double payment;
        try (Scanner scanner = new Scanner(System.in)) {
            payment = scanner.nextDouble();
        }
        NumberFormat currus = NumberFormat.getCurrencyInstance();
        NumberFormat currcn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currfr = NumberFormat.getCurrencyInstance(Locale.FRANCE);//java.text package
        NumberFormat currind = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        String us = currus.format(payment);
        String india = currind.format(payment);
        String china = currcn.format(payment);
        String france = currfr.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

