package days43;

public class days43 {

    public static void main(String[] args) {
        int a = 20;
        int b = 15;

        boolean c = a <= b;
        System.out.printf("%d <= %d : %b%n", a, b, c);
        c = a >= b;
        System.out.printf("%d >= %d : %b%n", a, b, c);

        a %= b;
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " >= " + b + " : " + (a >= b));

        a *= b;
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " >= " + b + " : " + (a >= b));

        a -= b;
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " >= " + b + " : " + (a >= b));

        a /= b;
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " >= " + b + " : " + (a >= b));

        a += b;
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " >= " + b + " : " + (a >= b));

        a -= 4;
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " >= " + b + " : " + (a >= b));

    }

}
