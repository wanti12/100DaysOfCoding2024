package days23;

public class Days23 {

    public static void main(String[] args) {
        Long saldoAwal, penerimaan, saldoAkhir, pengeluaran1, pengeluaran2, pengeluaran3, pengeluaran4, pengeluaran5,totalP;
        saldoAwal = 5000000L;
        System.out.println("saldo awal bulan lalu sebesar " + saldoAwal);
        penerimaan = 2500000L;
        System.out.println("penerimaan bulan lalu sebesar " + penerimaan);
        saldoAkhir = saldoAwal + penerimaan;
        System.out.println("jadi saldo akhir bulan lalu yaitu " + saldoAwal + " + " + penerimaan + " = " + saldoAkhir);
        System.out.println("");
        
        saldoAwal = saldoAkhir;
        System.out.println("saldo awal bulan ini sebesar " + saldoAwal);
        penerimaan = 3000000L;
        System.out.println("dengan penerimaan bulan ini sebesar " + penerimaan);
        saldoAkhir = saldoAwal + penerimaan;
        System.out.println("jadi saldo sementara yaitu " + saldoAwal + " + " + penerimaan + " = " + saldoAkhir);
        pengeluaran1 = 500L;
        pengeluaran2 = 200L;
        pengeluaran3 = 900L;
        pengeluaran4 = 1500000L;
        pengeluaran5 = 2000000L;
        totalP=pengeluaran1+pengeluaran2+pengeluaran3+pengeluaran4+pengeluaran5;
        System.out.printf("pengeluaran bulan ini\npertama %d\nkedua %d\nketiga %d\nkeempat %d\nkelima %d\n",
                pengeluaran1, pengeluaran2, pengeluaran3, pengeluaran4, pengeluaran5);
        System.out.printf("rekapitulasi:\nsaldo awal sebesar %d + (penerimaan) %d = %d"
                + " - (total pengeluaran) %d\n",saldoAwal,penerimaan,saldoAkhir,totalP);
        saldoAkhir=saldoAkhir-totalP;
        System.out.println("jadi saldo akhir bulan ini sebesar "+saldoAkhir);
                }
}
