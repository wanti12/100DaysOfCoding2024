package days15double;

public class Days15double {

    public static void main(String[] args) {
        double value1, value2, value3, value4, value5;
        value1 = 1.1234567;
        value2 = 2.2222222;
        value3 = 3.3333333;
        value4 = 4.4444444;
        value5 = 5.5555555;
        System.out.printf("nilai ke-1 = %.1f\nnilai ke-2 = %.2f\nnilai ke-3 = %.3f\nnilai ke-4 = %.4f\nnilai ke-5 = %.5f", value1, value2, value3, value4, value5);

        double value6 = 6.12345678987;
        double value7 = 7.98327458372;
        double value8 = 6.82957520947;
        double value9 = 6.98723456942;
        double value10 = 6.98023348592;
        double value11 = 6.13948502937;
        double value12 = 6.74362923479;
        double value13 = 6.49205869402;
        double value14 = 6.46920593795;
        System.out.println("\nnilai ke-6 = " + String.format("%.7f", value6)
                + "\nnilai ke-7 = " + String.format("%.7f", value7)
                + "\nnilai ke-8 = " + String.format("%.7f", value8)
                + "\nnilai ke-9 = " + String.format("%.7f", value9)
                + "\nnilai ke-10 = " + String.format("%.7f", value10)
                + "\nnilai ke-11 = " + String.format("%.7f", value11)
                + "\nnilai ke-12 = " + String.format("%.7f", value12)
                + "\nnilai ke-13 = " + String.format("%.7f", value13)
                + "\nnilai ke-14 = " + String.format("%.7f", value14));

        double phi = 22.0 / 7.0;        
        System.out.println("nilai phi = " + String.format("%.2f", phi));
        System.out.println("nilai phi = " + String.format("%.3f", phi));
        System.out.println("nilai phi = " + String.format("%.4f", phi));
        System.out.println("nilai phi = " + String.format("%.5f", phi));
        System.out.println("nilai phi = " + String.format("%.6f", phi));
        System.out.println("nilai phi = " + String.format("%.7f", phi));
        System.out.println("nilai phi = " + String.format("%.8f", phi));
        System.out.println("nilai phi = " + String.format("%.9f", phi));
        System.out.println("nilai phi = " + String.format("%.10f", phi));
        System.out.println("nilai phi = " + String.format("%.11f", phi));

    }
}
