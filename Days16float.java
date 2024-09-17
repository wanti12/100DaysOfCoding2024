package days16;

public class Days16float {

    public static void main(String[] args) {
        float A1, A2, A3, A4;
        float B1 = 11.2f;
        float B2 = 22.2f;
        float B3 = 45.5f;
        float B4 = 10.44f;
        System.out.printf("B1 = %f\nB2 = %f\nB3 = %f\nB4 = %f", B1, B2, B3, B4);

        A1 = B1;
        A2 = B2;
        A3 = B3;
        A4 = B4;
        System.out.println("\n");
        System.out.print("A1 = " + A1 + ", A2 = " + A2 + ", A3 = " + A3 + ", A4 = " + A4);

        B1 = 4f;
        B2 = 8f;
        B3 = 12f;
        B4 = 16f;        

        float C = B1;
        B1 = B3;
        B3 = B4;
        B4 = B2;
        B2 = C;
        System.out.println("\nnilai B setelah di update");
        System.out.println("B1 = " + B1 + "\nB2 = " + B2 + "\nB3 = " + B3 + "\nB4 = " + B4);
    }

}
