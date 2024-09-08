package days07InisialisasiVariabel;

import java.util.Arrays;

public class Days07InisialisasiVariabel {

    public static void main(String[] args) {
        byte b = 127;
        short s = 220;
        int i = 999999999;
        float f = 99.99999583923424f;
        long l = 1299879938;
        double d = 122.873100393374829;
        boolean bo = true;
        char c = 'W';
        String st = "halo informatika";
        int a[] = {1, 7, 8, 9, 3};
        System.out.printf("byte: %d\nshort: %d\nint: %d\nfloat: %f\nlong: %d\ndouble: %f\nboolean: %b\nchar: %c\nString: %s\nArrays: %s\n",
                 b, s, i, f, l, d, bo, c, st, Arrays.toString(a));

        /*pendeklarasian variabel juga bisa dilakukan dengan lebih dari 
        satu variabel dengan satu tipe data contoh:*/
        int i1, i2, i3, i4;
        i1 = 99892021;
        i2 = 998893202;
        i3 = 253239941;
        i4 = 2123457899;
        System.out.printf("\n\nvariabel tipe data int:\nvar1= %d\nvar2= %d\nVar3= %d\nvar4= %d", i1, i2, i3, i4);
        String s1, s2, s3, s4;
        s1 = "halo";
        s2 = "informatika";
        s3 = "2023";
        s4 = "jaya";
        System.out.printf("\n\nvariabel tipe data String:\nvar1= %s\nvar2= %s\nvar3= %s\nvar4= %s\n",s1,s2,s3,s4);
    }
}
