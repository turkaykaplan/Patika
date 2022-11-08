/*
- www.patika.dev
--Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {

        Scanner yazdir = new Scanner(System.in);

        int n,r;
        System.out.print("Kombinasyonu alınacak sayı: "); // C(n,r) "n" sayısının değeri
        n = yazdir.nextInt();
        System.out.print("Kombinasyonun alınacağı değer: "); // C(n,r) "r" sayısının değeri
        r = yazdir.nextInt();
        double totalN = 1, totalR = 1,totalK = 1;
        int combination, b = n-r;

        for(int i=1; i<=n;i++){
            totalN = totalN*i;
        }

        for(int i=1; i<=r;i++){
            totalR = totalR*i;
        }

        for(int i=1; i<=b; i++){ // Formüldeki (n-r)! kısmının faktöriyeli hesaplandı.
            totalK = totalK*i;
        }

        combination = (int) (totalN/(totalR * totalK)); // (int) yukarıda double olarak verilen değerlerin int'e dönüşmesini sağlar.
                                                        // tanımlama yaparken double yerine int olarak da yazılabilirdi.
        System.out.print("Sonuç: "+combination);

    }
}
