package days19;

public class Days19string {
    public static void main(String[] args) {
        String a,b,c,d,e,f;
        a="hello";
        System.out.printf("%s ",a);
        b="informatika";
        System.out.printf("%s ",b);
        c="universitas";
        System.out.printf("%s ",c);
        d="sulawesi";
        System.out.printf("%s ",d);
        e="barat";
        System.out.printf("%s ",e);
        System.out.println("");
        
        f=a+b;
        System.out.println(f);
        a="lala";
        System.out.println(a);
        b="lili";
        System.out.println(b);
        c="lulu";
        System.out.println(c);
        
        String y=a;
        a=c;
        c=b;
        b=y;
        System.out.print(a+","+b+" ,"+c);
        System.out.println("");
        
    }
}
