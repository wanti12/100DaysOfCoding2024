package days68;

import java.util.Scanner;

public class days68 {

    static int p;
    static int l;

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input panjang: ");
        p = wa.nextInt();
        System.out.print("input lebar: ");
        l = wa.nextInt();
        hitungLuas();
        hitungKeliling();

    }

    public static int hitungLuas() {
        int luas = p * l;
        System.out.printf("luas persegi panjang = %d cm%n", luas);
        return luas;
    }

    public static int hitungKeliling() {
        int keliling = 2 * (p + l);
        System.out.printf("keliling persegi panjang = %d cm%n", keliling);
        return keliling;
    }
}
