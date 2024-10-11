package days40;

import java.util.Scanner;

public class days40 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan angka 1 ");
        int a = wa.nextInt();
        System.out.println("masukkan angka 2 ");
        int b = wa.nextInt();

        System.out.println(a + " > " + b + " = " + (a > b));

        System.out.println("masukkan angka 3 ");
        int c = wa.nextInt();
        System.out.println(a + "< " + c + " = " + (b < c));

        int d = a + b;
        System.out.printf("hasil penjumlahan %d + %d = %d%n", a, b, d);
        System.out.println("hasil penjumlahan < " + c + " = " + (d < c));

        int e = d * a;
        System.out.printf("hasil perkalian %d x %d = %d%n", d, a, e);
        System.out.println("hasil perkalian < " + a + " = " + (e < a));

        System.out.println(a + " > " + c + " = " + (a > c));
    }
}
