package days97;

import java.util.Scanner;

public class days97 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input batas: ");
        int n = wa.nextInt();

        System.out.println("bilangan prima: ");
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

}
