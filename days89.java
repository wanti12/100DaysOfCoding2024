package days89;

import java.util.Scanner;

public class days89 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("1.luas lingkaran\n2.luas jajargenjang\n3.lua trapesium");
        System.out.print("input pilihan (1-3): ");
        int input = wa.nextInt();

        double luas;
        switch (input) {
            case 1:
                System.out.print("input jari-jari = ");
                double jari = wa.nextInt();
                luas = Math.PI * (jari * jari);
                System.out.printf("luas lingkaran = %.2f%n", luas);
                break;
            case 2:
                System.out.print("input panjang alas = ");
                double alas = wa.nextInt();
                System.out.print("input tinggi = ");
                double tinggi = wa.nextInt();
                luas = alas * tinggi;
                System.out.printf("luas jajargenjang = %.2f%n", luas);
                break;
            case 3:
                System.out.print("input sisi atas = ");
                double a = wa.nextDouble();
                System.out.print("input sisi bawah = ");
                double b = wa.nextDouble();
                System.out.print("inpu tinggi = ");
                double t = wa.nextDouble();
                luas = (a + b) / 2 * t;
                System.out.printf("luas trapesiuum  =%.2f%n ", luas);
                break;
            default:
                System.out.println("input tidak valid");
        }
    }

}
