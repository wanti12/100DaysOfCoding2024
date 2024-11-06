package days65;

import java.util.Scanner;

public class days65 {

    public static void main(String[] args) {
       Scanner wa = new Scanner(System.in);
        System.out.print("masukkan batas: ");

        if (wa.hasNextInt()) {
            int batas = wa.nextInt();
            if (batas > 0) {
                for (int i = 1; i <= batas; i++) {
                    int jumlah=0;
                    System.out.println("baris " + i + " : ");
                    for (int j = 1; j <= i; j++) {
                        jumlah += j;
                        System.out.print(j);
                        if (j < i) {
                            System.out.print(" + ");
                        }
                    }
                    System.out.println(" = " + jumlah);
                }

            } else {
                System.out.print("input harus positif");
            }
        } else {
            System.out.println("input harus angka");
        }
    }
}
