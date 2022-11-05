import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya,muzik, dersSayisi =0, toplam=0;
        double ortalama;
        Scanner yazdir = new Scanner(System.in);

            System.out.println("Matematik notunuzu girin: ");
            mat = yazdir.nextInt();
            if(mat >=0 && mat <=100 ) {
                dersSayisi++;
                toplam += mat;
            }

            System.out.println("Fizik notunuzu girin: ");
            fizik = yazdir.nextInt();
            if(fizik >=0 && fizik <=100 ) {
                dersSayisi++;
                toplam += fizik;
            }

            System.out.println("Türkçe notunuzu girin: ");
            turkce = yazdir.nextInt();
            if(turkce >=0 && turkce <=100 ) {
                dersSayisi++;
                toplam += turkce;
            }

            System.out.println("Kimya notunuzu girin: ");
            kimya = yazdir.nextInt();
            if(kimya >=0 && kimya <=100 ) {
            dersSayisi++;
            toplam += kimya;
            }

            System.out.println("Müzik notunuzu girin: ");
            muzik = yazdir.nextInt();
            if(muzik >=0 && muzik <=100 ) {
                dersSayisi++;
                toplam += muzik;
            }

            ortalama =toplam/dersSayisi;
            if(ortalama>55){
            System.out.println("Geçtiniz! Ortalamanız: " + ortalama);
            }else{
                System.out.println("Kaldınız. Ortalamanız: " +ortalama);
            }

    }
}
