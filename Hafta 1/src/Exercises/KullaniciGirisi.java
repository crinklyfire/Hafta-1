package Exercises;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("kodluyoruz") && password.equals("123456789")) {
            System.out.println("Giriş yaptınız. ");

        }else{
            System.out.println("Kullanıcı adı veya Parola yanlış. Parolınız değiştirmek istiyorsanız. Parolamı unuttum seçeneğine tıklayınız");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String sifremiUnuttum = input.nextLine();

            switch (sifremiUnuttum){
                case "evet":
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword = input.nextLine();

                    if (newPassword.equals("123456789")){
                        System.out.print("Yeni şifreniz son 3 şifreniz ile aynı olamaz. ");

                    }else {
                        System.out.print("Şifreniz başarıyla değiştirildi");
                        break;
                    }
                case "hayır":
                    System.out.print("Lütfen tekrar deneyiniz.");
            }
        }
    }
}
