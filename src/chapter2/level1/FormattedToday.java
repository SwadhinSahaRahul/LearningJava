package chapter2.level1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedToday {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String formattedToday = simpleDateFormat.format(today);
        System.out.print(formattedToday);
    }
}
