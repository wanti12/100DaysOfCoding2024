package days94;
import java.util.Scanner;
public class days94 {
    public static void main(String[] args) {
        Scanner wa = new Scanner (System.in);
        System.out.print("input angka: ");
        int input = wa.nextInt();
        
        System.out.println("");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
