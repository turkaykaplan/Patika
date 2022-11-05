import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, select, newPassword = " ";
        Scanner yazdir = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin: ");
        userName = yazdir.nextLine();
        System.out.print("Şifrenizi girin: ");
        password = yazdir.nextLine();
        boolean askPass = true;

        if(userName.equals("patika") && password.equals("java123")){ // username=patika & password=java123
            System.out.println("Giriş yaptınız!");

        } else {
            System.out.println("Şifreniz yanlış. Şifre sıfırlamak için '1' ya da '2' yazın");
            select = yazdir.nextLine();
            if (select.equals("1")){
                do {
                    System.out.print("Sifre yaz: ");
                    newPassword = yazdir.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.print("Şifre eskisiyle aynı olamaz. Farklı bir şifre deneyin: ");

                    }else if(!newPassword.equals("java123")){
                        System.out.println("Yeni şifreniz oluşturuldu.");
                        askPass = false;
                    }

            }while (askPass);

        }else {
                System.out.println("Çıkış yaptınız!");
            }

        }

    }
}
