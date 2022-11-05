import java.util.Scanner;

public class DortunKatlariHesaplama {
    public static void main(String[] args) {

        int c;
        int total=0;
        Scanner yazdir = new Scanner(System.in);

        do {
            System.out.print("Sayı girin: ");
            c = yazdir.nextInt();
                if(c%2==0 && c%4==0){
                    total += c;
                }

        }while (c%2!=1); // while(c%2==0)

        System.out.println("Toplam: " +total);



    }
}
