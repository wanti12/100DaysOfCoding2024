package days62;

import java.util.Scanner;

public class days62 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan batas: ");
        int batas = wa.nextInt();
        System.out.print("masukkan angka pertama: ");
        int a = wa.nextInt();
        System.out.print("masukkan angka kedua: ");
        int b = wa.nextInt();

        int c = a * b;
        if (batas >= c) {
            for (int i = 1; i <= batas; i++) {

                if (i == c) {
                    System.out.println("Loop di hentikan pada angka " + i);
                    break;
                }

                System.out.println(i);
            }

        } else {
            System.out.printf("hasil perkalian %d x %d melebihi batas%n", a, b);
        }

        System.out.println("program selesai");
    }
}
