package days83;

import java.util.Scanner;

public class days83 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        byte array1[];
        array1 = new byte[10];
        short array2[];
        array2 = new short[5];

        int array3[] = new int[10];
        long array4[] = new long[5];

        System.out.print("input penjang index array5: ");
        int a = wa.nextInt();
        float array5[] = new float[a];
        System.out.print("input penjang index array6: ");
        int b = wa.nextInt();
        double array6[] = new double[b];
        System.out.print("input penjang index array7: ");
        int c = wa.nextInt();
        String array7[] = new String[c];

        System.out.println("\npanjang index setiap array:");
        System.out.println("array1 = " + array1.length);
        System.out.println("array2 = " + array2.length);
        System.out.println("array3 = " + array3.length);
        System.out.println("array4 = " + array4.length);
        System.out.println("array5 = " + array5.length);
        System.out.println("array6 = " + array6.length);
        System.out.println("array7 = " + array7.length);
    }

}
