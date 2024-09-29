package days28;

public class days28 {

    public static void main(String[] args) {
        System.out.println("status penerbangan dan penumpang");
        Boolean penerbanganTepatWaktu, cuacaCerah, penumpangTelahChekin;
        penerbanganTepatWaktu = true;
        cuacaCerah = true;
        penumpangTelahChekin = false;
        final Boolean penumpangVip = true;
        final Boolean penerbanganInternasional = true;

        System.out.println("kondisi sebelum penerbangan, cuaca tiba-tiba memburuk");
        penerbanganTepatWaktu = false;
        cuacaCerah = false;
        System.out.printf("penerbangan tepat waktu: %b dan kondisi cuaca cerah: %b%n", penerbanganTepatWaktu, cuacaCerah);

        penumpangTelahChekin = true;
        System.out.printf("penumpang telah melakukan chek-in: %b%n", penumpangTelahChekin);

        System.out.print("setelah beberapa jam cuaca kembali cerah\n");
        cuacaCerah = true;
        System.out.printf("cuaca berubah cerah: %b%n", cuacaCerah);

        System.out.printf("penerbangan ini adalah penerbangan internasional: %b%n"
                + "dengan beberapa penumpang vip: %b%n", penerbanganInternasional, penumpangVip);
        Boolean kondisiPintu = false;
        Boolean kondisiKeamanan = false;
        System.out.println("semua penumpang sudah duduk di kursi masing-masing");
        kondisiPintu = true;
        kondisiKeamanan = true;
        System.out.printf("kondisi pintu pesawat sudah terkunci: %b%n", kondisiPintu);
        System.out.printf("kondisi sistem keamanan pesawat telah aktif: %b.%n", kondisiKeamanan);
    }
}
