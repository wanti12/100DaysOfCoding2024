package days20;

public class Days20 {

    public static void main(String[] args) {
        Byte ali = 20;
        Byte budi = 15;
        Byte cici = 18;
        Byte dedi = 22;
        Byte evi = 17;
        System.out.println("jumlah kelereng pemain sebelum pertukaran");
        System.out.printf("jumlah kelereng Ali = %d\n", ali);
        System.out.printf("jumlah kelereng Budi = %d\n", budi);
        System.out.printf("jumlah kelereng Cici = %d\n", cici);
        System.out.printf("jumlah kelereng Dedi = %d\n", dedi);
        System.out.printf("jumlah kelereng Evi = %d\n", evi);

        Byte x = ali;
        ali = budi;
        budi = x;
        Byte y = cici;
        cici = dedi;
        dedi = y;

        ali = (byte) (ali + 5);
        budi = (byte) (budi + 3);
        cici = (byte) (cici + 2);
        dedi = (byte) (dedi + 4);
        System.out.println("jumlah kelereng pemain setelah di tukar");
        System.out.println("jumlah kelereng Ali = " + ali);
        System.out.println("jumlah kelereng Budi = " + budi);
        System.out.println("jumlah kelereng Cici = " + cici);
        System.out.println("jumlah kelereng Dedi = " + dedi);
        System.out.println("jumlah kelereng Evi =" + evi);
    }
}
