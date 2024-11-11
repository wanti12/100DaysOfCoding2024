package days71;

import java.util.Scanner;

public class days71 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input: ");
        int input = wa.nextInt();

        System.out.println("hasil " + input + " x " + input + " = " + days71.kuadrat(input));
        System.out.println("hasil " + input + " + " + input + " = " + days71.tambah(input));
        System.out.println("hasil " + input + " - 2 = " + days71.kurang(input));
        System.out.println("hasil " + input + " / 2 = " + days71.bagi(input));

    }

    static int kuadrat(int x) {
        return x * x;
    }

    static int tambah(int x) {
        return x + x;
    }

    static int kurang(int x) {
        return x - 2;
    }

    static int bagi(int x) {
        return x / 2;
    }
}
