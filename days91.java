package days91;

import java.util.Scanner;

public class days91 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        while (true) {
            System.out.print("input angka: ");
            int input = wa.nextInt();
            if (input % 2 == 0) {
                System.out.println("genap");
            } else {
                System.out.println("You and I, end");
                break;
            }
        }
    }

}
