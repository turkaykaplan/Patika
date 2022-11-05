import java.util.Scanner;

public class EtkinlikOneri {

        public static void main(String[] args) {

            Scanner yazdir =new Scanner(System.in);
            int derece;
            System.out.println("Sıcaklık girin: ");
            derece=yazdir.nextInt();

            if(derece<5) {
                System.out.println("Kayak yaomayı tercih edebilirsiniz.");
            } else if(derece>5 && derece<15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } else if(derece>15 && derece<25) {
                System.out.println("Piknik etkinliğini yapabilirsiniz.");
            } else {
                System.out.println("Yüzmeye gidebilirsiniz.");
            }

        }
    }

