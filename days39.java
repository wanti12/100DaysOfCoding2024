package days39;

import java.util.Scanner;

public class days39 {

    public static void main(String[] args) {
        //mengambil nilai dari inputan
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan angak pertama ");
        int a = wa.nextInt();
        System.out.println("masukkan angka kedua ");
        int b = wa.nextInt();

        //mencari sisa bagi
        int c = a % b;
        System.out.printf("sisa bagi %d / %d = %d%n", a, b, c);
        
        //operasi penugasan,perkalian,dan sisa bagi
        System.out.println("masukkan angka ketiga ");
        int d = wa.nextInt();
        int e = d * c;
        System.out.printf("%d x %d = %d%n", d, c, e);
        double f = e % 2;
        System.out.printf("sisa bagi %d / 2 = %f%n", e, f);

        String g =String.valueOf(f);
        System.out.println("nilai f dalam bentuk string = "+g);
    }
}
