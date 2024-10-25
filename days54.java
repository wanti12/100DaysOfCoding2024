package days54;

import java.util.Scanner;

public class days54 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan batas ");
        int batas = wa.nextInt();

        System.out.printf("mencetak angka 1 sampai %d menggunakan increment 1%n", batas);
        for (int i = 1; i <= batas; i++) {
            System.out.print(i + " ");
        }

        System.out.printf("%n%nmencetak angka 1 sampai %d menggunakan increment 2%n", batas);
        for (int i = 1; i <= batas; i += 2) {
            System.out.print(i + " ");
        }

        System.out.printf("%n%nmencetak angka 1 sampai %d menggunakan increment ix2%n", batas);
        for (int i = 1; i <= batas; i *= 2) {
            System.out.print(i + " ");
        }

        int a =4;
        System.out.printf("%n%nmencetak angka 1 sampai %d menggunakan increment i+4%n", batas);
        for (int i = 1; i <= batas; i += a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
