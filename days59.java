package days59;

import java.util.Scanner;

public class days59 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan jumlah inputan : ");

        int jumlah = 0;
        if (wa.hasNextInt()) {
            int x = wa.nextInt();
            int[] y = new int[x];
            System.out.print("masukkan inputan angka: ");

            for (int i = 0; i < x; i++) {
                y[i] = wa.nextInt();
                if (y.length > x) {
                    System.out.println("inputan melebihi jumlah inputan");
                }
            }
            for (int a : y) {
                System.out.print(a + " ");

                jumlah += a;
            }
        } else {
            System.out.println("input bukan angka");
        }

        System.out.println("\ntotal = " + jumlah);

    }
}
