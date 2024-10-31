package days60;

import java.util.Scanner;

public class days60 {

    public static void main(String[] args) {
        System.out.println("Absensi mahasiswa");

        String a, b, c, d;
        do {
            Scanner wa = new Scanner(System.in);
            System.out.print("masukkan nama mahasiswa: ");
            a = wa.nextLine();
            System.out.print("kelas: ");
            b = wa.nextLine();
            System.out.print("keterangan: ");
            c = wa.nextLine();

            System.out.printf("nama         : %s%n", a);
            System.out.printf("kelas        : %s%n", b);
            System.out.printf("keterangan   : %s%n", c);

            System.out.println("stop/lanjut?");
            d = wa.nextLine();
        } while (d.equals("lanjut"));

        System.out.println("absensi selesai");

    }
}
