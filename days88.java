package days88;

import java.util.Scanner;

public class days88 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input (awali dan akhiri dengan spasi):");
        String input = wa.nextLine();

        System.out.println("sebelum di hapus : [" + input + "]");
        System.out.println(input.length() + " karakter");
        String setelah = input.trim();
        System.out.println("setelah di hapus : [" + setelah + "]");
        System.out.println(setelah.length() + " karakter");

    }

}
