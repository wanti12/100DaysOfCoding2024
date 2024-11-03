package days63;

import java.util.Scanner;

public class days63 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan batas: ");
        int batas = wa.nextInt();
        System.out.print("masukkan angka yang di lewati ");
        int x = wa.nextInt();

        int a = 0;
        if (batas >= x) {

            while (a < batas) {
                a++;
                if (a == x) {
                    continue;
                }
                System.out.print(a + " ");

//                if (a == batas) {
//                    break;
//                }

            }
        } else {
            System.out.println("angka yang di inputkan melebihi batas loop");
        }
        System.out.println("");

    }
}
