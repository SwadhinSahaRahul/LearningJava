package Chapter5;

public class Comparison {
    public static void main(String[] args) {
        String str1 = new String("latte");
        String str2 = new String("Latte");
        boolean result1 = str1 == str2;
        boolean result2 = str1.equals(str2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
