package days51;

import java.util.Scanner;

public class days51 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan inputan operasi \n+\n-\nx\n/");
        char in = wa.next().charAt(0);

        switch (in) {
            case '+':
                System.out.println("masukkan angka pertama");
                int a = wa.nextInt();
                System.out.println("masukkan angka kedua");
                int b = wa.nextInt();
                System.out.println("hasil penjumlahan = " + (a + b));
                break;
            case '-':
                System.out.println("masukkan angka pertama");
                a = wa.nextInt();
                System.out.println("masukkan angka kedua");
                b = wa.nextInt();
                System.out.println("hasil pengurangan = " + (a - b));
                break;
            case 'x':
                System.out.println("masukkan angka pertama");
                a = wa.nextInt();
                System.out.println("masukkan angka kedua");
                b = wa.nextInt();
                System.out.println("hasil perkalian = " + (a * b));
                break;
            case '/':
                System.out.println("masukkan angka pertama");
                a = wa.nextInt();
                System.out.println("masukkan angka kedua");
                b = wa.nextInt();
                System.out.println("hasil pembagian = " + (a / b));
                break;
            default:
                System.out.println("input tidak valid");
        }
    }
}
