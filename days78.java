package days78;

import java.util.Scanner;

public class days78 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int angka, hasil;
        String status;

        do {
            System.out.print("input angka 1-10: ");
            angka = wa.nextInt();
            wa.nextLine();
            System.out.printf("perkalian %d:%n",angka);
            for (int i = 1; i <= 10; i++) {
                hasil = i * angka;
                System.out.printf("%d x %d = %d%n", i, angka, hasil);
            }

            System.out.print("lanjut/stop? ");
            status = wa.nextLine();
            System.out.println("");
            
        } while (status.equalsIgnoreCase("lanjut"));
        System.out.println("program selesai");
    }
}
