package days58;

import java.util.Scanner;

public class days58 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print(" masukkan batas: ");
        int n = wa.nextInt();

        int x = 0;
        int sum = 0;
        int avg;
        if (n > 0) {
            while (n >= 1) {
                sum += n;
                System.out.print(n);
                if (n > 1) {
                    System.out.print(" + ");
                }
                n--;
                x++;

            }
        } else {
            System.out.println("input harus positif atau >0");
        }

        avg = sum / x;
        System.out.println(" = " + sum);
        System.out.println("tara-rata = " + avg);
    }
}
