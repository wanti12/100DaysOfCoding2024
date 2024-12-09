package days99;

import java.util.Scanner;

public class days99 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input nilai awal = ");
        int x = wa.nextInt();
        System.out.print("input nilai akhir = ");
        int y = wa.nextInt();

        int hasil = 0;
        if (x > y) {
            for (int i = x; i >= y; i--) {
                if (i % 2 == 0) {
                    hasil += i;
                }
            }
        } else {
            for (int i = x; i <= y; i++) {
                if (i % 2 == 0) {
                    hasil += i;
                }
            }
        }
        System.out.printf("jumlah bilangan genap dari %d sampai %d = %d%n", x, y, hasil);

    }

}
