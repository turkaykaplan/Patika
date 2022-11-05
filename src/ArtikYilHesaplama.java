import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı Giriniz: ");
        yil= input.nextInt();

        if ((yil%400==0) || (yil%100!=0 && yil%4==0)){
            System.out.print(yil +" bir artık yıldır.");
        }else{
            System.out.print(yil+" bir artık yıl değildir.");
        }
    }
}