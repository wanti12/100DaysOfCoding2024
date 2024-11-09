package evaluasi3;

import java.util.Scanner;

public class no3 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println(Math.PI);

        selesai:
        while (true) {
            System.out.println("Pilihan Menu : \n"
                    + "1. Hitung Luas Persegi \n"
                    + "2. Hitung Luas Lingkaran \n"
                    + "3. Hitung Luas Segitiga \n"
                    + "4. Keluar");

            System.out.print("masukkan pilihan menu (1-4) = ");
            int pilih = wa.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("input sisi= ");
                    double sisi = wa.nextDouble();
                    System.out.println("luas persegi = "+luaspersegi(sisi));
                    break;
                case 2:
                    System.out.print("input jari-jari= ");
                    double jari=wa.nextDouble();
                    luasLingkaran(jari);
                    break;
                case 3:
                    System.out.print("input alas = ");
                    double alas=wa.nextDouble();
                    System.out.print("input tinggi = ");
                    double tinggi=wa.nextDouble();
                    luasTiga(alas, tinggi);
                    break;
                case 4:
                    System.out.println("program selesai");
                    break selesai;
                default:
                    System.out.println("input tidak valid");
                    break;
            }
            System.out.println("");
        }
    }

    public static double luaspersegi(double s) {
        return s * s;
    }
    public static double luasLingkaran(double r){
        double luas = Math.PI*r*r;
        System.out.println("luas lingkaran "+luas);
        return luas;
    }
    public static double luasTiga(double a,double t){
        double luas = 0.5*a*t;
        System.out.println("luas lingkaran "+luas);
        return luas;
    }
}
