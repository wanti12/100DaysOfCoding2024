package days22;

public class Days22 {

    public static void main(String[] args) {
        Integer a = 2229;
        Integer b = 2938;
        Integer c = 20394;
        Integer d = 93938;
        Integer e = 93482;
        Integer f = 73334;
        Integer g = 92833;
        Integer h = 52523;
        Integer i = 223334;
        Integer j = 5243;

        System.out.printf("a = %d\nb = %d\nc = %d\nd = %d\ne = %d\n",
                a, b, c, d, e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        Integer x = a;
        a = b + c;
        b = d + e;
        c = f + g;
        d = h + i;
        e = j + x;
        
        System.out.printf("nila setelah di tukar dan di update\n"
                + "a = %d\nb = %d\nc = %d\nd = %d\ne = %d\n",
                a, b, c, d, e);

    }
}
