package day57;

import java.util.Scanner;

public class days57 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan batas: ");
        int a = wa.nextInt();

        if (a > 0) {
            int x = 1;
            String genap = "";
            String ganjil = "";
            int Tgenap = 0;
            int Tganjil = 0;

            while (x <= a) {
                if (x % 2 == 0) {
                    genap += x + " ";
                    Tgenap += x;
                } else {
                    ganjil += x + " ";
                    Tganjil += x;
                }
                x++;
            }
            System.out.println(genap);
            System.out.println(ganjil);
            System.out.printf("%ntotal bilangan genap dari 1 - %d = %d%n", a, Tgenap);
            System.out.printf("total bilangan ganjil dari 1 - %d = %d%n", a, Tganjil);
        } else {
            System.out.println("input harus positif dan besar nol");
        }
    }
}
