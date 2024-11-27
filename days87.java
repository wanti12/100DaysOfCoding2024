package days87;

import java.util.Arrays;
import java.util.Scanner;

public class days87 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("input jumlah elemen array: ");
        int size = wa.nextInt();

        int [] array = new int[size];
        System.out.println("input elemen array");
        for (int i = 0; i < array.length; i++) {
            System.out.print("index [" + i + "] = ");
            array[i] = wa.nextInt();
        }
        System.out.println("array sebelum diubah = " + Arrays.toString(array));

        System.out.println("input index yang ingin di ubah (0-" + (size - 1) + "): ");
        int indexBaru = wa.nextInt();

        if (indexBaru < 0 || indexBaru >= size) {
            System.out.println("index tidak valid!");
        } else {
            System.out.println("input nilai baru untuk index " + indexBaru + " = ");
            int nilaBaru = wa.nextInt();
            array[indexBaru] = nilaBaru;
            System.out.println("array setelah di ubah = " + Arrays.toString(array));
        }
    }

}
