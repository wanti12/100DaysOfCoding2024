package days52;

import java.util.Scanner;

public class days52 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("inputkan angka 1-10 (bil bulat)");

        if (wa.hasNextInt()) {
            int in = wa.nextInt();
            String kondisi = (in % 2 == 0) ? "genap" : "ganjil";
            System.out.printf("inputan berupa angka %s%n", kondisi);

            if (kondisi.equals("genap")) {
                if (in > 5) {
                    System.out.println("angka lebih besar dari 5");
                } else {
                    System.out.println("angka lebih kecil dari 5");
                }
            } else if (kondisi.equals("ganjil")) {
                if (in > 5) {
                    System.out.println("angka lebih besar 5");
                } else if (in < 5) {
                    System.out.println("angka lebih kecil 5");
                } else {
                    System.out.println("angka sama dengan 5");
                }
            }
        } else {
            System.out.println("input tidak valid");
        }
    }
}
