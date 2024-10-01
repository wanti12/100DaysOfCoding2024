package days30;

import java.math.BigDecimal;

public class days30 {

    public static void main(String[] args) {
        BigDecimal saldoAwal, pendapatan, pengeluaran, saldoPertama, saldoKedua, pajak,saldoAkhir;
        saldoAwal = BigDecimal.valueOf(1500000.25);
        pendapatan = BigDecimal.valueOf(500000.75);
        pengeluaran = BigDecimal.valueOf(300000.50);

        System.out.printf("saldo awal = %.2f%npendapatan = %.2f%npengeluaran = %.2f%n",
                 saldoAwal, pendapatan, pengeluaran);

        saldoPertama = saldoAwal.add(pendapatan);
        System.out.printf("saldo saat ini = %.0f%n", saldoPertama);

        saldoKedua = saldoPertama.subtract(pengeluaran);
        System.out.printf("saldo setelah pengeluaran = %.1f%n", saldoKedua);

        pendapatan = BigDecimal.valueOf(400000.90);
        saldoPertama = saldoKedua.add(pendapatan);
        System.out.printf("saldo saat ini setelah ditambah pendapatan kedua = %.1f%n", saldoPertama);

        pajak = BigDecimal.valueOf(0.10);
        saldoAkhir=saldoPertama.subtract(saldoPertama.multiply(pajak));
        System.out.println(saldoAkhir);
        System.out.println("\nsaldo akhir setelah dipotong pajak = " + saldoAkhir);
    }
}
