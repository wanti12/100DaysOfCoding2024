package days92;

import java.util.Scanner;

public class days92 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input angka: ");
        int input = wa.nextInt();

        System.out.println("");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < 2 * input - 1; j++) {
                if (j == i || j == 2 * input - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
