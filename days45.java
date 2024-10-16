package days45;

import java.math.BigInteger;

public class days45 {

    public static void main(String[] args) {
        String a = "unsulbar";
        String b = "majene";
        boolean ab = a.equals(b) || b.equals(a);
        System.out.println(ab);
        ab = a.equals(b) || b.equals("majene");
        System.out.println(ab);

        int c = 12;
        int d = 88;
        ab = c > 10 || d < 100;
        System.out.println(ab);
        ab = c < 2 || d > 100;
        System.out.println(ab);

        BigInteger e = BigInteger.valueOf(123456789);
        BigInteger f = BigInteger.valueOf(987654321);
        ab = e == f || e != f;
        System.out.println(ab);
        ab = e.equals(f) || f.equals(e);
        System.out.println(ab);

        char g = 'A';
        int h = 65;
        ab = g == h || h == 60;
        System.out.println(ab);
    }
}
