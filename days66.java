package days66;

import java.util.Scanner;

public class days66 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan angka genap(^2) ganjil(+2): ");
        int x = wa.nextInt();
        hasil(x);
        
    }

    public static void hasil(int x) {
        int y;

        if (x % 2 == 0 && x > 0) {
            y = x * x;

            System.out.println("inputan genap maka: ");
            System.out.printf("%d x %d = %d%n", x, x, y);
        } else {
            y = x + 2;

            System.out.println("inputan ganjil maka: ");
            System.out.printf("%d + 2 = %d%n", x, y);
        }

    }
}
