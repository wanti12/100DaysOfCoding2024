package days75;

import java.util.Scanner;

public class days75 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan input dengan huruf kapital: ");
        String input = wa.nextLine();

        String hasil = input.toLowerCase();
        System.out.printf("%ninputan pengguna: %s%n", input);
        System.out.printf("setelah di ubah: %s%n", hasil);

        String genap = "";
        
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (i % 2 == 0) {
                genap += Character.toLowerCase(x);
                
            } else {
                genap += x;
            }
        }
        System.out.printf("mengubah index genap: %s%n", genap);

    }

}
