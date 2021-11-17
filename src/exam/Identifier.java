package exam;

public class Identifier {
    public static void main(String[] args) {
        int _int, int$, $int = 3;
        _int = 1;
        int$ = 2;
        System.out.format("%d %d %d", _int, int$, $int);
    }
}
