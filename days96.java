package days96;

import java.util.Scanner;

public class days96 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input angka: ");

        int input = wa.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = input - 2; i >= 0; i--) {
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
