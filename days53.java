package days53;

import java.util.Scanner;

public class days53 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan batas");
        int batas = wa.nextInt();

        double sum = 0;
        double data = 0;

        for (int i = 2; i < batas; i++) {
            boolean prima = true;
           
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.println(i);
                sum += i;
                data++;
            }
        }
        double avg = sum / data;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
