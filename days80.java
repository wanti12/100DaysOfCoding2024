package days80;

import java.util.Scanner;

public class days80 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        String a = " wanti ";//spasi
        String b = a.trim();
        System.out.printf("sebelum: [%s]%n", a);
        System.out.printf("sesudah: [%s]%n", b);
        a = "   wanti   ";//tab
        b = a.trim();
        System.out.printf("sebelum: [%s]%n", a);
        System.out.printf("sesudah: [%s]%n", b);

        System.out.println("");
        System.out.print("input kalimat (di awali dan di akhiri spasi):");
        a = wa.nextLine();
        int panjang = a.length();
        System.out.printf("kalimat sebelum trim [%s]%n", a);
        System.out.printf("panjang kalimat sebelum trim %d%n", panjang);

        b = a.trim();
        System.out.println("kalimat setelah trim = [" + b + "]");
        System.out.println("panjang kalimat setelah trim = " + b.length());
    }

}
