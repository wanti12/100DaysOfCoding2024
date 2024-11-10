<<<<<<< HEAD
package evaluasi3;

import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
Scanner wa = new Scanner (System.in);
        System.out.print("input: ");
        int n = wa.nextInt();
        
        int total=0;
        for (int i = 1; i <=n; i++) {
            if(i%4==0){
                total*=2;
            }
            else{
                total+=100;
            }
        }
        System.out.println("output : "+total);
    }
}
=======
package evaluasi3;

import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
Scanner wa = new Scanner (System.in);
        System.out.print("input: ");
        int n = wa.nextInt();
        
        int total=0;
        for (int i = 1; i <=n; i++) {
            if(i%4==0){
                total*=2;
            }
            else{
                total+=100;
            }
        }
        System.out.println("output : "+total);
    }
}
>>>>>>> 19f2121b45e986d78545e525d7b29704c85a3a30
