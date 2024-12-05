package days95;

import java.util.Scanner;

public class days95 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input angka: ");
        int input = wa.nextInt();

        System.out.println("segitiga siku-siku");
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("segitiga siku-siku terbalik");
        for (int i = input; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

}
