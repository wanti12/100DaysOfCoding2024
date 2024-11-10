package days70;

import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        selesai:
        for(;;) {
            System.out.println("pilihan menu\n"
                    + "1.penjumlahan\n"
                    + "2.pengurangan\n"
                    + "3.perkalian\n"
                    + "4.pembagian\n"
                    + "5.keluar");

            System.out.print("masukkan pilihan (1-5): ");
            int pilih = wa.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("masukkah angka pertama =");
                    int a = wa.nextInt();
                    System.out.print("masukkah angka kedua =");
                    int b = wa.nextInt();
                    penjumlahan(a, b);
                    break;
                case 2:
                    System.out.print("masukkah angka pertama =");
                    a = wa.nextInt();
                    System.out.print("masukkah angka kedua =");
                    b = wa.nextInt();
                    pengurangan(a, b);
                    break;
                case 3:
                    System.out.print("masukkah angka pertama =");
                    a = wa.nextInt();
                    System.out.print("masukkah angka kedua =");
                    b = wa.nextInt();
                    perkalian(a, b);
                    break;
                case 4:
                    System.out.print("masukkah angka pertama =");
                    a = wa.nextInt();
                    System.out.print("masukkah angka kedua =");
                    b = wa.nextInt();
                    pembagian(a, b);
                    break;
                case 5:
                    System.out.println("program selesai");
                    break selesai;
                default:
                    System.out.println("input tidak valid");
            }
            System.out.println("");
        }
    }

    public static void penjumlahan(int var1, int var2) {
        System.out.println("hasil penjumlahan = " + (var1 + var2));
    }

    public static void pengurangan(int var1, int var2) {
        System.out.println("hasil pengurangan = " + (var1 - var2));
    }

    public static void perkalian(int var1, int var2) {
        System.out.println("hasil perkalian = " + (var1 * var2));
    }

    public static void pembagian(int var1, int var2) {
        if (var2 == 0) {
            System.out.println("input pembagi tidak valid (0)");
        } else {
            System.out.println("hasil pembagian = " + (var1 / var2));
        }
    }

}
