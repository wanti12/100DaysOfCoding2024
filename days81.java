package days81;

import java.util.Scanner;

public class days81 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int x = 10;
        int y = 10;
        String n = String.valueOf(x) + String.valueOf(y);
        System.out.printf("hasil penjumlahan %d + %d = %s%n", x, y, n);

        System.out.print("input angka pertama: ");
        double a = wa.nextDouble();
        System.out.print("input angka kedua: ");
        double b = wa.nextDouble();

        double jumlah = a + b;
        double kurang = a - b;
        double kali = a * b;
        double bagi = a / b;

        String hasil;
        hasil = String.valueOf(jumlah);
        System.out.printf("hasil penjumlahan %s%n", hasil);
        hasil = String.valueOf(kurang);
        System.out.printf("hasil penjumlahan %s%n", hasil);
        hasil = String.valueOf(kali);
        System.out.printf("hasil penjumlahan %s%n", hasil);
        hasil = String.valueOf(bagi);
        System.out.printf("hasil penjumlahan %s%n", hasil);
    }

}
