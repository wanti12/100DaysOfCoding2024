package days21;

public class Days21 {

    public static void main(String[] args) {
        Short a, b, c, d, e;
        a = 990;
        b = 880;
        c = 770;
        d = 660;
        e = 550;
        System.out.println("nilai variabel sebelum di update");
        System.out.printf("nilai ke1 = %d\n", a);
        System.out.printf("nilai ke2 = %d\n", b);
        System.out.printf("nilai ke3 = %d\n", c);
        System.out.printf("nilai ke4 = %d\n", d);
        System.out.printf("nilai ke5 = %d\n", e);

        a = 123;
        b = 345;
        c = 567;
        d = 789;
        e = 987;
        System.out.println("nilai variabel setelah di update dan di kurangi");
        System.out.println(a + " - 5 = " + (a - 5));
        System.out.println(b + " - 10 = " + (b - 10));
        System.out.println(c + " - 15 = " + (c - 15));
        System.out.println(d + " - 20 = " + (d - 20));
        System.out.println(e + " - 25 = " + (e - 25));

    }
}
