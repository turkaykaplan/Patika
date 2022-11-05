import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {


        double armut=2.14, elma = 3.67,domates = 1.11, muz = 0.95, patlican = 5.00;

        Scanner yazdir = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        int kiloArmut = yazdir.nextInt();
        double miktarA = kiloArmut*armut;

        System.out.print("Elma Kaç Kilo?: ");
        int kiloElma = yazdir.nextInt();
        double miktarE = kiloElma*elma;

        System.out.print("Domates Kaç Kilo?: ");
        int kiloDomates = yazdir.nextInt();
        double miktarD = kiloDomates*domates;

        System.out.print("Muz Kaç Kilo?: ");
        int kiloMuz = yazdir.nextInt();
        double miktarM = kiloMuz*muz;

        System.out.print("Patlıcan Kaç Kilo?: ");
        int kiloPatlican = yazdir.nextInt();
        double miktarP = kiloPatlican*patlican;

        double toplam = miktarA+miktarE+miktarD+miktarM+miktarP;
        System.out.println("Toplam Tutar: " +toplam +" TL");


    }
}
