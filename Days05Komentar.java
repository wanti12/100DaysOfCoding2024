package days05Komentar;

public class Days05Komentar {
    public static void main(String[] args) {
        //contoh penggunaan System.out.ptintln();        
        System.out.println("hello nama saya wanti");
        System.out.println("asal saya dari papalang\n");
        /*hasil dari mencentak menggunakan System.out.println
        secara otomatis akan menambahkan baris baru setelah
        mencetak output
        */
        
        //contoh penggunaan System.out.print();
        System.out.print("hello nama saya wanti ");
        System.out.print("asal saya dari papalang");
        /*hasil dari mencetak menggunakan System.out.print
        saat mencetak teks atau nilai tidak menabahkan baris baru setelah 
        mencetak output
        */
        
        System.out.println("\n");
        //contoh penggunaan System.out.printf
        String nama="wanti";
        int umur=19;
        System.out.printf("hello nama saya %s saya berusia %d tahun",nama,umur);
        /*Digunakan untuk mencetak teks dengan format yang lebih spesifik,
        Bisa digunakan untuk format angka, string, dan lain-lain.
        */
        System.out.println("");
    }
}
