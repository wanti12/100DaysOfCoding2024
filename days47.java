package days47;

import java.util.Scanner;

public class days47 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan angka 1 : ");
        int a = wa.nextInt();
        System.out.println("masukkan angak 2 : ");
        int b = wa.nextInt();

        if (a % 2 == 0) {
            if (a < b) {
                System.out.println("angka pertama genap dan lebih kecil dari angka kedua");
            }
            if (a > b) {
                System.out.println("angka pertama genap dan lebih besar dari angka kedua");
            }
            if(a==b){
                System.out.println("angka pertama genap dan sama dengan angka kedua");
            }
        }
        if (a % 2 != 0) {
            if (a < b) {
                System.out.println("angka pertama ganjil dan lebih kecil dari angka kedua");
            }
            if (a > b) {
                System.out.println("angka pertama ganjil dan lebih besar dari angka kedua");
            }
            if(a==b){
                System.out.println("angka pertama ganjil dan sama dengan angka kedua");
            }
        }
    }
}
