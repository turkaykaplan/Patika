import java.util.Scanner;

public class VucutKitleEndeksi {

    public static void main(String[] args) {
        double formul;

        Scanner yazdir = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: " );
        double boy = yazdir.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = yazdir.nextDouble();

        formul = (kilo/(boy * boy));
        System.out.print("Vücut kitle endeksiniz: "+formul);



    }
}
