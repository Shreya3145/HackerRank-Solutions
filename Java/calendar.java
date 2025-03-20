import java.util.*;

class Result {
    public static String findDay(int month, int day, int year){
        Calendar c = Calendar.getInstance(); 
        c.set(year, month-1, day);
        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
}
}