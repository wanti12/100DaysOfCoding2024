package days29;

import java.math.BigInteger;

public class days29 {
    public static void main(String[] args) {
        BigInteger a, b, c, d, e, f, g, h, i, j, k, l;
        a = BigInteger.ZERO;
        System.out.println(a);
        b = BigInteger.ONE;
        System.out.println(b);
        c = BigInteger.TWO;
        System.out.println(c);
        d = BigInteger.TEN;
        System.out.println(d);
        
        e = new BigInteger("12345677898765432123456789");
        
        System.out.println(e);
        f = BigInteger.valueOf(1234567789);
        System.out.println(f);
        g = BigInteger.valueOf(987654321);
        System.out.println(g);
        
        h = g.add(f);//edd methodd
        System.out.println(g+" + "+f+" = "+h);
        i = f.subtract(g);//sebctract
        System.out.println(f+" - "+g+" = "+i);
        j = h.multiply(g);//maltiplay
        System.out.println(h+" x "+g+" = "+j);
        k = j.divide(f);//devaid
        System.out.println(j+" / "+f+" = "+k);
    }
}
