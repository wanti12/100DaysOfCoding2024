package days32;

public class days32 {

    public static void main(String[] args) {
        String a;

        byte b = 13;
        System.out.printf("nilai byte = %d%n", b);
        a = String.valueOf(b);
        System.out.printf("nilai byte setelah di konversi ke String = %s%n", a);

        short c = 160;
        System.out.printf("nilai short = %d%n", c);
        a = String.valueOf(c);
        System.out.printf("nilai short setelah di konversi ke string = %s%n", a);

        int d = 99876;
        System.out.printf("nilai int = %d%n", d);
        a = String.valueOf(d);
        System.out.printf("nilai int setelah di konversi ke string = %s%n", a);

        long e = 1823456789;
        System.out.printf("nilai long = %d%n", e);
        a = String.valueOf(e);
        System.out.printf("nilai long setelah di konversi ke string = %s%n", a);
        
        float f = 999.123f;
        System.out.printf("nilai float = %.3f%n", f);
        a = Float.toString(f);
        System.out.printf("nilai float setelah di konversi ke string = %s%n", a);

        double g = 999.87654321;
        System.out.printf("nilai double = %f%n", g);
        a = Double.toString(g);
        System.out.printf("nilai double setelah di konversi ke string = %s%n", a);
       
        char h = 'W';
        System.out.printf("nilai char = %c%n", h);
        a = h + "";
        System.out.printf("nilai char setelah di konversi ke string = %s%n", a);

        boolean i = false;
        System.out.printf("nilai boolean = %b%n", i);
        a = i + "";
        System.out.printf("nilai boolean setelah di konversi ke string = %s%n", a);
    }
}
