package days36;

import java.util.Scanner;

public class days36 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan inputan ");
        int input = wa.nextInt();

        String bin = "";

        bin = (input % 2) + bin;
        input = input / 2;
        bin = (input % 2) + bin;
        input = input / 2;
        bin = (input % 2) + bin;
        input = input / 2;
        bin = (input % 2) + bin;
        input = input / 2;
        bin = (input % 2) + bin;
        input = input / 2;
        bin = (input % 2) + bin;
        input = input / 2;
        bin = (input % 2) + bin;
        input = input / 2;
        bin = (input % 2) + bin;

        System.out.println("hasil konversi ke binner = " + bin);
        
        System.out.println("masukkan inputan ke dua");
        int persen = wa.nextInt();

        System.out.println("hasil 77% dari " + persen + " adalah = " + (persen * 0.77));

    }

}
