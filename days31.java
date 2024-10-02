package days31;

public class days31 {

    public static void main(String[] args) {
        String a;
        a = "12";
        byte b = Byte.parseByte(a);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke byte = %d%n", b);

        a = "130";
        short c = Short.parseShort(a);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke short = %d%n", c);

        a = "129877";
        int d = Integer.parseInt(a);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke int = %d%n", d);

        a = "123456789";
        long e = Long.parseLong(a);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke long = %d%n", e);

        a = "89.9";
        float f = Float.parseFloat(a);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke float = %f%n", f);

        a = "9876.123";
        double g = Double.parseDouble(a);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke double = %f%n", g);

        a = "true";
        boolean h = Boolean.parseBoolean(a);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke boolean = %b%n", h);

        a = "Wanti";
        char i = a.charAt(2);
        System.out.printf("nilai string = %s%n", a);
        System.out.printf("nilai konversi ke char = %c%n", i);
    }
}
