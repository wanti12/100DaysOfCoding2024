package days72;

import java.math.BigInteger;
import java.util.Scanner;

public class days72 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input positif : ");
        int x = wa.nextInt();
        int jumlah = jumlahDigit(x);
        System.out.printf("jumlah digit input = %d%n", jumlah);
        BigInteger hasil = faktorial(BigInteger.valueOf(x));
        System.out.printf("hasil dari %d! = %s%n", x, hasil);

    }

    private static int jumlahDigit(int digit) {
        if (digit < 10) {
            return 1;
        } else {
            return 1 + jumlahDigit(digit / 10);
        }
    }

    private static BigInteger faktorial(BigInteger f) {
        if (f.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return f.multiply(faktorial(f.subtract(BigInteger.ONE)));
        }
    }

}
