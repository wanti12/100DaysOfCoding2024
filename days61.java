package days61;

import java.util.Scanner;

public class days61 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan inputan: ");
        String a = wa.nextLine();
        System.out.print("masukkan angka 1: ");
        int b = wa.nextInt();
        System.out.print("masukkan angka 2:");
        int c = wa.nextInt();

        int x = 1;
        while (true) {
            System.out.println("literasi ke = " + x);
            System.out.println(a);
            System.out.println("hasil penjumlahan " + b + " + " + c + " = " + (b + c));
            System.out.println("hasil pengurangan " + b + " - " + c + " = " + (b - c));
            System.out.println("hasil perkalian " + b + " x " + c + " = " + (b * c));
            System.out.println("hasil pembagian " + b + " / " + c + " = " + (b / c));

            x++;
            System.out.println("\n");

        }
    }
}
