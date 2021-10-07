package Chapter8.Problem9;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        setNumerator(num);
        setDenominator(denom);
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denom) {
        assert denom == 0;
        try {
            if (denom == 0) {
                System.err.println("Fatal Error");
                System.exit(1);
            }
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
        denominator = denom;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }
}