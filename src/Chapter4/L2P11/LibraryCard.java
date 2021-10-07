package Chapter4.L2P11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LibraryCard {
    GregorianCalendar date;

    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar(1992, Calendar.MARCH, 26);
        LibraryCard libraryCard = new LibraryCard();
        libraryCard.setExpDate(date);
        System.out.print("Year: " + libraryCard.getExpYear() + " Month: " + libraryCard.getExpMonth() + " Day: " + libraryCard.getExpDay());
    }

    //sets the expiration date
    public void setExpDate(GregorianCalendar date) {
        this.date = date;
    }

    //returns the expiration year
    public int getExpYear() {
        return date.get(GregorianCalendar.YEAR);
    }

    //returns the expiration month
    public int getExpMonth() {
        return date.get(GregorianCalendar.MONTH);
    }

    //returns the expiration day
    public int getExpDay() {
        return date.get(GregorianCalendar.DATE);
    }
}
