package days44;

import java.math.BigInteger;
import java.util.Scanner;

public class days44 {
    
    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan angka pertama ");
        int a = wa.nextInt();
        System.out.println("masukkan angka kedua ");
        int b = wa.nextInt();
        
        boolean c = a == b && a != 4;
        System.out.println(c);
        
        String d = "wanti";
        String e = "unsulbar";
        c = d.equals("wanti") && e.equals("unsulbar");
        System.out.println(c);
        c = d.equals("informatika") && e.equals("unsulbar");
        System.out.println(c);
        
        double f = 99.9;
        double g = 88.9;
        c = f == g && g <= 100;
        System.out.println(c);
        g = 99.9;
        c = f == g && g <= 100;
        System.out.println(c);
        c = f < 100 && g > 80;
        System.out.println(c);
        
        BigInteger x = BigInteger.valueOf(200000);
        BigInteger y = BigInteger.valueOf(200000);
        c = x.equals(BigInteger.valueOf(300000)) && y.equals(x);
        System.out.println(c);        
    }
}
