package guru.qa;

public class FirstClass {

    // целочисленные типы

    byte aByte = 80; // 8 bit, -128 ... 127
    short aShort = 8000; // 16 bit, -32768 ... 32767
    int anInt = 800_000; // 32 bit, -2 ^ 31 ... (2 ^ 31) -1
    long aLong = 8_000_000L; // 64 bit, -2 ^ 63 ... (2 ^ 63) -1

    // с плавающей точкой

    float aFloat = 2.5F; // 32 bit
    double aDouble = 1.7; // 64 bit, самый используемый, если хранить, но не использовать арифметику

    char aChar = 102; // символьный
    boolean aBoolean = true; // логический

    public static void main(String[] args) {

        byte x = 127;
        short y = 32767;
        long a = 500L;
        int b = 700;

        a += b; // a = a + b

        boolean f = false, t = true;
        char ch1 = 'h', ch2 = 'i';

        System.out.println(a + b);
        System.out.println(y - x);
        System.out.println(x * y * a);
        System.out.println(a - x * a);
        System.out.println(y / x);
        System.out.println(b % a);
        System.out.println("Приветствие:" + " " + ch1 + ch2);
        System.out.println((a++ - ++b) == (x-- * --y));
        System.out.println(b > x);
        System.out.println(y < a);
        System.out.println(b >= a);
        System.out.println(ch1 <= ch2);
        System.out.println(x != y);

        boolean result = (y > x) || (b < a) && t;
        boolean result2 = !(b > a) | (x == y) & f;

        Book watchmen = new Book();
        watchmen.doReadBook();

    }

}
