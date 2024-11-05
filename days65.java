package days65;

import java.util.Scanner;

public class days65 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("===Pilihan Menu===");
        System.out.println("1. Nasi Goreng - Rp15,000\n"
                + "2. Mie Goreng - Rp12,000\n"
                + "3. Ayam Goreng - Rp20,000\n"
                + "4. Sate Ayam - Rp25,000\n"
                + "5. Es Teh - Rp5,000");

        int totalHarga = 0;
        int harga = 0;
        String namaMakanan = "";
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    namaMakanan = "nasi goreng";
                    harga = 15000;
                    break;
                case 2:
                    namaMakanan = "mie ayam";
                    harga = 12000;
                    break;
                case 3:
                    namaMakanan = "pangsit";
                    harga = 20000;
                    break;
                case 4:
                    namaMakanan = "mie bakso";
                    harga = 15000;
                    break;
                case 5:
                    namaMakanan = "es teh";
                    harga = 5000;
                    break;
                default:
                    System.out.println("kode makaann tidak valid");
                    continue;
            }
            System.out.print("menu saat ini: " + namaMakanan + " input (y/n)?");
            String pilih = wa.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                System.out.print("masukkan jumlah porsi: ");
                int porsi = wa.nextInt();
                wa.nextLine();
                harga = harga * porsi;
                totalHarga += harga;
                System.out.printf("%s x % d = %d%n", namaMakanan, porsi, harga);

            }
            System.out.println("");
        }
        System.out.println("\n\n===Total Pesanan===");
        System.out.println("= Rp." + totalHarga);
        System.out.println("terimakah telah memesan");

    }
}
