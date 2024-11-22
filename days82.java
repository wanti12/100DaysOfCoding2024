package days82;

import java.util.Scanner;

public class days82 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        double a = 12.2;
        System.out.println("nilai = " + a);
        System.out.println("di bulatkan ke atas = " + Math.ceil(a));
        System.out.println("di bulatkan ke bawah = " + Math.floor(a));
        System.out.println("di bulatkan ke ke bilangan terdekat = " + Math.round(a));

        System.out.print("input panjang tanah = ");
        double panjang = wa.nextDouble();
        System.out.print("input lebar tanah = ");
        double lebar = wa.nextDouble();

        panjang = Math.ceil(panjang);
        lebar = Math.floor(lebar);

        double luas = panjang * lebar;
        luas = Math.round(luas);
        System.out.println("panjang tanah setelah di bulatkan ke atas = "+panjang);
        System.out.println("lebar tanah setelah di bulatkan ke bawah = "+lebar);
        System.out.println("luas tanah setelah di bulatkan ke bilangan terdekat = "+luas);
    }

}
