package days48;

import java.util.Scanner;

public class days48 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan nama pelanggan ");
        String nama = wa.nextLine();
        System.out.println("masukkan umur pelanggan  ");
        byte umur = wa.nextByte();
        System.out.println("total belanjaan ");
        double harga = wa.nextDouble();

        if (umur >= 18 && harga >= 1000000) {
            System.out.println("");
            double hargaDiskon = harga - (harga * 0.1);
            System.out.printf("nama pelangggan: %s%n", nama);
            System.out.printf("usia: %d%n", umur);
            System.out.println("status pelanggan: pelanggan VIP");
            System.out.printf("total harga yang harus di bayar = %.2f%n", hargaDiskon);
            System.out.println("pelanggan berhak mendapatkan potongan harga sebesar 10%");
        } else {
            System.out.printf("nama pelangggan: %s%n", nama);
            System.out.printf("usia: %d%n", umur);
            System.out.println("status pelanggan: pelanggan reguler");
            System.out.printf("total harga yang harus di bayar = %.2f%n",harga);
            System.out.println("mohon maaf pelanggan tidak mendapatkan potongan harga");
        }
    }
}
