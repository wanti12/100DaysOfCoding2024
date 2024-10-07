package days35;

import java.util.Scanner;

public class days35 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("operasi penjumlahan");
        System.out.println("angka pertama : ");
        int a = wa.nextInt();
        System.out.println("angka kedua : ");
        int b = wa.nextInt();
        int c = a + b;

        System.out.printf("angka pertama = %d%n angka kedua = %d%n", a, b);
        System.out.printf("hasil %d + %d = %d%n", a, b, c);

        System.out.println("\n\noperasi pengurangan");
        System.out.println("angka pertama : ");
        double d = wa.nextDouble();
        System.out.println("angka kedua : ");
        double e = wa.nextDouble();
        double f = d - e;

        System.out.printf("angka pertama = %f%n angka kedua = %f%n", d, e);
        System.out.printf("hasil %f + %f = %f%n", d, e, f);

        System.out.println("operasi gabungan");
        double x = c + f - e;
        System.out.printf("%d + %f - %f = %f", c, f, e, x);
    }
}
