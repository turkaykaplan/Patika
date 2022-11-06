import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner yazdir = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int number = yazdir.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int number2 = yazdir.nextInt();

        System.out.println("-----Seçin-----:");
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        int choice = yazdir.nextInt();

        switch (choice){
            case 1:
                int result = number+number2;
                System.out.println("Sonuç: "+result);
                break;
            case 2:
                int result1 = number-number2;
                System.out.println("Sonuç: "+result1);
                break;
            case 3:
                int result2 = number*number2;
                System.out.println("Sonuç: "+result2);
                break;
            case 4:
                int result3 = number/number2;
                System.out.println("Sonuç: "+result3);
                break;
            default:
                System.out.println("Geçersiz tuşlama yaptınız!");
        }
    }
}
