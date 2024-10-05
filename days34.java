package days34;

import java.util.Scanner;

public class days34 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan nama: ");
        final String nama = wa.nextLine();
        System.out.println("masukkan nim: ");
        String nim = wa.nextLine();
        System.out.println("masukan umur: ");
        byte umur = wa.nextByte();
        wa.nextLine();
        System.out.println("masukkan alamat: ");
        String alamat = wa.nextLine();

        System.out.println("nama mahasiswa  : " + nama);
        System.out.println("nim mahasiswa  : " + nim);
        System.out.println("umur mahasiswa   : " + umur);
        System.out.println("alamat mahasiswa : " + alamat);

        System.out.println("\n\nsilahkan update nilai nim dan alamat");
        System.out.println("masukkan nim yang baru: ");
        nim = wa.nextLine();        
        System.out.println("masukkan alamat yang baru");
        alamat = wa.nextLine();
        umur +=1;
        System.out.println("\n\ndata setelah di update");
        System.out.println("nama mahasiswa      : " + nama);
        System.out.println("nim mahasiswa       : " + nim);
        System.out.println("umur mahasiswa (+1) : " + umur);
        System.out.println("alamat mahasiswa    : " + alamat);

    }
}
