package days73;

import java.util.Scanner;

public class days73 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input kalimat/kata: ");
        String input = wa.nextLine();
        System.out.print("input index: ");
        int index = wa.nextInt();
        char karakter = input.charAt(index);
        System.out.printf("karakter pada index ke %d = %c%n", index, karakter);
        hitungKarakter(input);

    }

    public static void hitungKarakter(String kalimat) {
        String huruf = "";
        int x=0;
        String karakter = "";
        int y = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            char z = kalimat.charAt(i);
            if (Character.isLetter(z)) {
                huruf += z;
                x++;
            } else {
                karakter += z;
                y++;
            }
        }
        System.out.printf("karakter huruf (%s) = %d karakter%n", huruf,x);
        System.out.printf("karakter lainnya (%s) = %d karater%n", karakter,y);
    }
}
