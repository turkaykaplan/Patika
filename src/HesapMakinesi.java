import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner yazdir = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int sayi = yazdir.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = yazdir.nextInt();

        System.out.println("-----Seçin-----:");
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        int secim = yazdir.nextInt();

        switch (secim){
            case 1:
                int sonuc = sayi+sayi2;
                System.out.println("Sonuç: "+sonuc);
                break;
            case 2:
                int sonuc1 = sayi-sayi2;
                System.out.println("Sonuç: "+sonuc1);
                break;
            case 3:
                int sonuc2 = sayi*sayi2;
                System.out.println("Sonuç: "+sonuc2);
                break;
            case 4:
                int sonuc3 = sayi/sayi2;
                System.out.println("Sonuç: "+sonuc3);
                break;
            default:
                System.out.println("Geçersiz tuşlama yaptınız!");
        }



    }
}
