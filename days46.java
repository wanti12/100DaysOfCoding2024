package days46;

public class days46 {

    public static void main(String[] args) {
        String a = "unsulbar";
        boolean ab = a.equals("unsulbar");
        System.out.println("nilai awal : " + ab);
        ab = !a.equals("unsulbar");
        System.out.println("penggunaan negasi : " + ab);

        char b = 'A';
        char c = 'G';
        ab = (b == c);
        System.out.println("nilai awal : " + ab);
        ab = !(b == c);
        System.out.println("penggunaan negasi : " + ab);

        int d = 65;
        ab = d <= 10;
        System.out.println("nilai awal : " + ab);
        ab = !(d <= 10);
        System.out.println("penggunaan negasi : " + ab);

        float e = 99.0f;
        double f = 12.2;
        ab = e > 100 && f < e;
        System.out.println("nilai awal : " + ab);
        ab = !(e > 100 && f < e);
        System.out.println("penggunaaan negasi : " + ab);
    }
}
