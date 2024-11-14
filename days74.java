package days74;

import java.util.Scanner;

public class days74 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input kalimat: ");
        String input = wa.nextLine();
        int n = input.length();

        System.out.printf("panjang inputan = %d%n", n);
        String x = "";
        int y = 0;
        System.out.printf("inputkan bilangan sebanyak %d kali%n", n);
        for (int i = 1; i <= n; i++) {
            System.out.printf("masukkan inputan ke-%d = ", i);
            int angka = wa.nextInt();
            x += angka;
            y += angka;
            if (i < n) {
                x += "+";
            }
        }
        System.out.printf("angka yang di inputkan = %s%n", x);
        System.out.printf("total = %s%n", y);

    }

}
