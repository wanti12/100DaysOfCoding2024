package days55;

public class days55 {

    public static void main(String[] args) {
        int batas = 50;

        System.out.printf("mencetak angka %d sampai 1 menggunakan decrement 1%n", batas);
        for (int i = batas; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.printf("%n%nmencetak angka %d sampai 1 menggunakan decrement 2%n", batas);
        for (int i = batas; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }

        System.out.printf("%n%nmencetak angka %d sampai 1 menggunakan decrement 3%n", batas);
        for (int i = batas; i >= 1; i -= 3) {
            System.out.print(i + " ");
        }

        int a = 4;
        System.out.printf("%n%nmencetak angka %d sampai 1 menggunakan decrement 4%n", batas);
        for (int i = batas; i >= 1; i -= a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
