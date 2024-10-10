package days38;

public class days38 {

    public static void main(String[] args) {
        byte a = 112;
        System.out.println("nilai byte = " + a);
        int b = 3900;
        System.out.println("nilai int= " + a);

        short c = 300;
        System.out.println("nilai awal short = " + c);
        c *= 2;
        System.out.println("nilai short setelah operasi perkalian = " + c);

        long d = 21119;
        System.out.println("nilai awal long = " + d);
        d *= b;
        System.out.println("nilai long setelah operasi perkalian = " + d);

        float e = 9987.123f;
        System.out.printf("nilai double = %f%n", e);
        e /= 10;
        System.out.printf("nilai double setelah operasi pembagian = %f%n", e);

        double f = 99875432098.98319;
        System.out.printf("nilai double = %f%n", f);
        f /= c;
        System.out.printf("nilai double setelah operasi pembagian = %f%n", f);

    }
}
