package days79;

import java.util.Scanner;

public class days79 {

    public static void main(String[] args) {
         Scanner wa = new Scanner(System.in);
        String hasilString;
        int a = 20003;
        hasilString = Integer.toString(a);
        System.out.printf("nilai int : %d%n", a);
        System.out.printf("nilai int dalam String : %s%n", hasilString);

        char b = 'A';
        hasilString = Character.toString(b);
        System.out.printf("nilai char : %c%n", b);
        System.out.printf("nilai char dalam String : %s%n", hasilString);

        System.out.print("input 8 bit(bil binner): ");
        String x = wa.nextLine();
        int hasil = 0;
        int desimal;
        int n = 128;

        if (x.length() == 8) {
            for (int i = 0; i < x.length(); i++) {
                char y = x.charAt(i);
                String z = Character.toString(y);
                desimal = Integer.parseInt(z) * n;
                hasil += desimal;
                n /= 2;
            }
        } else {
            System.out.println("input harus 8 bit");
        }
        System.out.printf("bil binner = %s%n", x);
        System.out.printf("bil desimal = %d%n", hasil);
    }
}
