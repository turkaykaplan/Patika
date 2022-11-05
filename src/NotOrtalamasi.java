import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double sonuc;

        Scanner yazdir = new Scanner(System.in);

        System.out.println("Ortalama hesaplama sistemini hoşgeldiniz!");

        System.out.println("Matematik notunuzu girin: ");
        mat = yazdir.nextInt();
        System.out.println("Fizik notunuzu girin: ");
        fizik = yazdir.nextInt();
        System.out.println("Kimya notunuzu girin: ");
        kimya = yazdir.nextInt();
        System.out.println("Türkçe notunuzu girin: ");
        turkce = yazdir.nextInt();
        System.out.println("Tarih notunuzu girin: ");
        tarih = yazdir.nextInt();
        System.out.println("Müzik notunuzu girin: ");
        muzik = yazdir.nextInt();

        sonuc = (mat+fizik+kimya+tarih+turkce+muzik)/6;

        System.out.println("Ortalamanız: "+sonuc);

        System.out.println (sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");



    }
}