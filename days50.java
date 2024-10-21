package days50;

import java.util.Scanner;

public class days50 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan pilihan\npenjumlahan\npengurangan\nperkalian\npembagian");
        String op = wa.nextLine();
        System.out.println("masukkan angka pertama ");
        int angka1 = wa.nextInt();
        System.out.println("masukkan angka ke dua ");
        int angka2 = wa.nextInt();
        int hasil;
        if (op.equals("penjumlahan")) {
            System.out.println("operasi pilihan penjumlahan");
            hasil = angka1 + angka2;
            System.out.printf("%d + %d = %d%n", angka1, angka2, hasil);
        } else if (op.equals("pengurangan")) {
            System.out.println("operasi pilihan pengurangan");
            hasil = angka1 - angka2;
            System.out.printf("%d - %d = %d%n", angka1, angka2, hasil);
        } else if (op.equals("perkalian")) {
            System.out.println("operasi pilihan perkalian");
            hasil = angka1 * angka2;
            System.out.printf("%d x %d = %d%n", angka1, angka2, hasil);
        } else if (op.equals("pembagian")) {
            if (angka1 != 0 && angka2 != 0) {
                System.out.println("operasi pilihan pembagian");
                hasil = angka1 / angka2;
                System.out.printf("%d / %d = %d%n", angka1, angka2, hasil);
            }
            else{
                System.out.println("input angka tidak valid untuk operasi pembagian");
            }
        } else {
            System.out.println("input tidak valid");
        }
    }

}
