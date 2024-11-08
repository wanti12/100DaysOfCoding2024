package days68;

import java.util.Scanner;

public class days68 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input panjang: ");
        int p = wa.nextInt();
        System.out.print("input lebar: ");
        int l = wa.nextInt();
        hitungLuas(p, l);
        hitungKeliling(p, l);

    }

    public static int hitungLuas(int p, int l) {
        int luas = p * l;
        System.out.printf("luas persegi panjang = %d cm%n", luas);
        return luas;
    }

    public static int hitungKeliling(int p, int l) {
        int keliling = 2 * (p + l);
        System.out.printf("keliling persegi panjang = %d cm%n", keliling);
        return keliling;
    }
}
