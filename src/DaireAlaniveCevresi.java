import java.util.Scanner;

public class DaireAlaniveCevresi {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner yazdir = new Scanner(System.in);
        System.out.println("Yarıçapı girin: ");
        int yaricap = yazdir.nextInt();

        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;

        System.out.println("Daire çevresi: "+cevre);
        System.out.println("Daire alanı: "+alan);

        System.out.println("A açısı girin: ");
        double a = yazdir.nextDouble();
        double formul =(pi * (yaricap*yaricap) * a) / 360;

        System.out.println("Yarıçapı ve açısıyla daire diliminin alanı: " +formul);

    }
}
