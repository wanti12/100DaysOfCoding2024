package days77;

import java.util.Scanner;

public class days77 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan inputan pertama: ");
        String input1 = wa.nextLine();
        System.out.print("masukkan inputan kedua: ");
        String input2 = wa.nextLine();

        String banding = input1.equals(input2) ? "sama" : "tidak sama";
        System.out.printf("apakah inutan pertama dan kedua sama? %s%n%n",banding);

        String a, b, c, d, e;
        do {
            System.out.print("input nama: ");
            a = wa.nextLine();
            System.out.print("input alamat: ");
            b = wa.nextLine();
            System.out.print("input kampus: ");
            c = wa.nextLine();
            System.out.print("input prodi: ");
            d = wa.nextLine();
            System.out.printf("halo nama saya %s saya berasal dari %s saya kuliah di kampus %s dengan mengambil program studi %s%n", a, b, c, d);
            System.out.print("input lanjut/stop: ");
            e = wa.nextLine();
            System.out.println("");
        } while (e.equals("lanjut"));
        System.out.println("program selesai");
    }
}
