package days33;

public class days33 {

    public static void main(String[] args) {
        byte a = 112;
        System.out.println("nilai byte = " + a);
        int b = (int) a;
        System.out.println("hasil casting byte menjadi int = " + b);

        int c = 200;
        System.out.println("nilai int = " + c);
        a = (byte) c;
        System.out.println("hasil casting int menjadi byte = " + a);

        short d = 550;
        System.out.println("nilai short = " + d);
        float e = (float) d;
        System.out.println("hasil casting short menjadi float = " + e);

        double f = 999875432;
        System.out.println("nila double = " + f);
        long g = (long) f;
        System.out.println("hasil casting double menjadi long = " + g);
        
        int h=65;
        System.out.println("nila int = "+h);
        char i=(char)h;
        System.out.println("hasil casting int menjadi char = "+i);
        
        double j=99.9;
        System.out.println("nilai double = "+j);        
        char k=(char)j;
        System.out.println("hasil casting char "+k);
        
    }
}
