package days64;

import java.util.Scanner;

public class days64 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan batas loop: ");
        int a = wa.nextInt();
        System.out.print("masukkan angka label break: ");
        int l = wa.nextInt();

        label:
        if(a>=l){
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=a; j++) {
                if (j == l) {
                    break label;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        }else{
            System.out.println("angka label break harus di dalam rentang loop");
        }
        System.out.println("Loop selesai.");
    }
}
