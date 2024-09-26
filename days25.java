package days25;

public class days25 {

    public static void main(String[] args) {
        Double hargaSemen, hargaPasir, hargaBatuBata, hargaPaku, hargaCat;
        hargaSemen = 50.000;
        hargaPasir = 100.000;
        hargaBatuBata = 500.000;
        hargaPaku = 20.000;
        hargaCat = 250.000;
        System.out.println("harga barang");
        System.out.printf("harga semen = %.3f\nharga pasir = %.3f\nharga bata = %.3f\nharga paku= %.3f\nharga cat= %.3f\n"
                ,hargaSemen,hargaPasir,hargaBatuBata,hargaPaku,hargaCat);
        
        Double jumlahS=10.0;
        Double jumlahP=2.5;
        Double jumlahB=3.000;
        Double jumlahK=5.0;
        Double jumlahC=3.0;
        
        System.out.println("total biaya per barang yang di perluhkan");
        System.out.println("total biaya semen = "+hargaSemen*jumlahS);
        System.out.println("total biaya pasir = "+hargaPasir*jumlahP);
        System.out.println("total biaya batu bata = "+hargaBatuBata*jumlahB);
        System.out.println("total biaya paku = "+hargaPaku*jumlahK);
        System.out.println("total biaya cat = "+hargaCat*jumlahC);
        
    }
}
