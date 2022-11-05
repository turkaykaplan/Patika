import java.util.Scanner;

public class DortveBesKuvvetleri {
    public static void main(String[] args) {
        int sayi;

        Scanner yazdir = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        sayi = yazdir.nextInt();

        for(int i=1; i<=sayi; i*=4){          // i = i*2
            System.out.print("4'ün kuvveti: "+i);
            System.out.println();
        }
        System.out.println("--------------------");
            for(int a=1; a<=sayi; a*=5){          // i = i*2
                System.out.print("5'in kuvveti: "+a);
                System.out.println();

        }

    }
}
