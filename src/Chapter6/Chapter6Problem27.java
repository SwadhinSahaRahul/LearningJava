package Chapter6;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Chapter6Problem27 {
    public static void main(String[] args) {
        Chapter6Problem27 obj = new Chapter6Problem27();
        float m = 90;
        float n = 30;
        obj.calculateSIN(m);
        obj.calculateCOS(n);
    }

    public void calculateSIN(float n) {
        float accuracy = (float) 0.0001, denominator, sinx, sinval;
        n = n * (float) (3.142 / 180.0);
        float x1 = n;
        sinx = n;
        sinval = (float) sin(n);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * n * n / denominator;
            sinx = sinx + x1;
            i = i + 1;
        }
        while (accuracy <= sinval - sinx);
        System.out.println(sinx);
    }

    public void calculateCOS(float n) {
        float accuracy = (float) 0.0001, x1, denominator, cosx, cosval;
        n = n * (float) (3.142 / 180.0);
        x1 = 1;
        cosx = x1;
        cosval = (float) cos(n);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i - 1);
            x1 = -x1 * n * n / denominator;
            cosx = cosx + x1;
            i = i + 1;
        }
        while (accuracy <= cosval - cosx);
        System.out.println(cosx);
    }
}
