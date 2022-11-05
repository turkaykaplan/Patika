import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner yazdir = new Scanner(System.in);

        double kdv0 = 0.18 , kdv1 = 0.08;
        int miktar;

        System.out.println("Miktar: ");
        miktar = yazdir.nextInt();

        double kdv = (miktar > 1000) ? miktar * kdv0 : miktar * kdv1;
        double kdvToplam = kdv+miktar;

        System.out.println("KDV'siz: " + miktar);
        System.out.println("KDV miktarı: " + kdv);
        System.out.println("KDV ile birlikte: " + kdvToplam);



    }
}
