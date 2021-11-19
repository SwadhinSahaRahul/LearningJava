package exam;

public class CallByReference {

    public int days;

    public CallByReference(int days) {
        this.days = days;
    }

    public static void main(String[] args) {
        CallByReference dayCalculator1, dayCalculator2;
        dayCalculator1 = new CallByReference(10);
        dayCalculator2 = dayCalculator1;

        dayCalculator1.setDays(20);
        System.out.println(dayCalculator1.days);
        System.out.println(dayCalculator2.days);
    }

    public void setDays(int days) {
        this.days = days;
    }
}
