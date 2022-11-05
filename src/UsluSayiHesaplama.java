import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        Scanner yazdir = new Scanner(System.in);

        int n,k;

        System.out.print("Üssü alınacak sayı girin: ");
        n  = yazdir.nextInt();
        System.out.print("Üssün değerini girin: ");
        k = yazdir.nextInt();

        int total = 1;
        int i = 1;

        for(i = 1; i<=k; i++){
            total = total*n;   // 2^3 = (((2*2)*2)*2)
    }

       System.out.print("Sonuç: "+total);


}
}
