/*
- www.patika.dev
*/
import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password;
        int counter = 3;
        int select;
        int amount;
        int total = 3000;

        while (4 > counter && counter > 0) { // counter'a verdiğimiz 3 limitiyle beraber döngüyü çalıştıracak!
            System.out.print("Kullanıcı adınızı girin: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi girin: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("123")) {
                System.out.println();
                do {
                    System.out.println();
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    System.out.println();
                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            amount = input.nextInt();
                            total += amount;
                            continue;

                        case 2:
                            System.out.print("Çekmek istediğiniz miktar: ");
                            amount = input.nextInt();
                            if (total > amount || total == amount) {
                                System.out.println("Para çekme işlemi başarılı");
                                total -= amount;

                            } else {
                                System.out.println(amount + " TL 'niz yok ");

                            }
                            continue;

                        case 3:
                            System.out.print("Bakiyeniz: " + total + " TL");
                            continue;

                        case 4:
                            System.out.println("Çıkış yaptınız!");
                            return;
                    }
                } while (true);

            }
            counter--;
            System.out.println("Hatalı giriş. Tekrar deneyin!");
            System.out.println(counter + " hakkınız kaldı!");
            if (counter == 0) {
                System.out.println("Hesabınız bloke olmuştur.");
            }

        }

    }
}