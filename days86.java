package days86;

import java.util.Arrays;
import java.util.Scanner;

public class days86 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int array1[] = {1, 2, 3, 4, 5};
        System.out.println("value array1 pada index ke-2 = " + array1[2]);

        double array2[] = {2.2, 1.2, 3.3, 4.4, 1.8};
        System.out.println("value array2: " + Arrays.toString(array2));

        System.out.print("input size array: ");
        int n = wa.nextInt();
        wa.nextLine();
        String array3[] = new String[n];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = wa.nextLine();
        }
        System.out.print("{");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);

            if (i < (array3.length - 1)) {
                System.out.print(",");
            } else {
                System.out.println("}");
            }

        }
    }

}
