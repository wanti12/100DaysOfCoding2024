package days90;

import java.util.Scanner;

public class days90 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input: ");
        int input = wa.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

}
