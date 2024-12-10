package days100;

import java.util.Scanner;

public class days100 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("input: ");
        System.out.print("angka pertama = ");
        double satu = wa.nextDouble();
        System.out.print("operasi (+,-,/,x): ");
        char operasi = wa.next().charAt(0);
        System.out.print("angka kedua = ");
        double dua = wa.nextDouble();

        double hasil;
        switch (operasi) {
            case '+':
                hasil = satu + dua;
                System.out.printf("%.01f + %.01f = %.01f%n", satu, dua, hasil);
                break;
            case '-':
                hasil = satu - dua;
                System.out.printf("%.01f - %.01f = %.01f%n", satu, dua, hasil);
                break;
            case 'x':
                hasil = satu * dua;
                System.out.printf("%.01f x %.01f = %.01f%n", satu, dua, hasil);
                break;
            case '/':
                if (dua == 0) {
                    System.out.println("eror: Kesalahan");
                } else {
                    hasil = satu / dua;
                    System.out.printf("%f / %f = %f%n", satu, dua, hasil);
                }
                break;
            default:
                System.out.println("input tidak valid");
        }
    }

}
