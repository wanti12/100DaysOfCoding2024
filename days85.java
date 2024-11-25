package days85;

import java.util.Arrays;
import java.util.Scanner;

public class days85 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        byte array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array2[] = {1, 2, 3, 4, 5};

        double array3[] = new double[]{2.2, 1.2, 3.3, 4.4, 1.8};

        String array4[] = {"wanti", "tisa", "yulia", "ayu", "dea", "serli"};

        System.out.print("input panjang index array: ");
        int n = wa.nextInt();
        wa.nextLine();
        String array5[] = new String[n];

        System.out.println("input value array berupa kata/kalimat:");
        for (int i = 0; i < array5.length; i++) {
            System.out.print("index ke- " + i + " = ");
            array5[i] = wa.nextLine();
        }
        System.out.println(Arrays.toString(array5));
    }

}
