import java.util.Scanner;
public class UcgenAlaniHesaplama {
    public static void main(String[] args) {

        System.out.println("Hipotenüs Bulma");
        Scanner yazdir = new Scanner(System.in);

        System.out.println("Birinci kenarı girin: ");
        int kenar1=yazdir.nextInt();
        System.out.println("İkinci kenarı girin: ");
        int kenar2=yazdir.nextInt();
        System.out.println("Üçüncü kenarı girin: ");
        int kenar3=yazdir.nextInt();

        double u=kenar1+kenar2+kenar3;
        double Cevre = 2 * u;
        System.out.println("Çevre Uzunluğu : " + Cevre);

        double Alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Alan: "+Alan);

    }
}
