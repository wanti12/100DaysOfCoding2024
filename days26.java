package days26;

public class days26 {

    public static void main(String[] args) {
        Character a, b, c, d, e;
        a = 'W';
        b = 'A';
        c = 'N';
        d = 'T';
        e = 'I';

        System.out.println("nilai variable sebelum di update");
        System.out.printf("a = %s%nb= %s%nc= %s%nd= %s%ne= %s%n", a, b, c, d, e);
        System.out.println("variabel sebelum di update jika digabung " + a + b + c + d + e);

        a = 'I';
        b = 'N';
        c = 'F';
        d = '-';
        e = 'A';

        System.out.println("nilai variabel setelah di update");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("variabel setelah di update jika digabung " + a + b + c + d + e);
    }
}
