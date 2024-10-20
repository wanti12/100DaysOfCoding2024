package days49;

import java.util.Scanner;

public class days49 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan nama  ");
        String nama = wa.nextLine();
        System.out.println("masukkan nim ");
        String nim = wa.nextLine();
        System.out.println("masukkan nilai ");
        byte nilai = wa.nextByte();

        System.out.printf("nama mahasiswa   :%s%n", nama);
        System.out.printf("nim mahasiswa    :%s%n", nim);
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("nilai A");
        } else if (nilai >= 70 && nilai < 85) {
            System.out.println("nilai B");
        } else if (nilai >= 55 && nilai < 70) {
            System.out.println("nilai C");
        } else if (nilai >= 40 && nilai < 55) {
            System.out.println("nilai D");
        } else if (nilai < 40) {
            System.out.println("nilai E");
        }
    }
}
