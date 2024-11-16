package days76;

import java.util.Scanner;

public class days76 {

    public static void main(String[] args) {
        Scanner wa =new Scanner(System.in);
        System.out.print("input non kapital: ");
        String a = wa.nextLine();        
        String b = a.toUpperCase();
        System.out.println("value : " + a);
        System.out.println("setelah di ubah: " + b);

        a += "informatika";
        System.out.println("value setelah di update: " + a);

        String hasil="";
        for (int i = 0; i < a.length(); i++) {
            char x =a.charAt(i);
            if(i%3==0){
                hasil+=Character.toUpperCase(x);
            }else{
                hasil+=x;
            }
        }
        System.out.println("setelah di ubah : "+hasil);
    }
}
