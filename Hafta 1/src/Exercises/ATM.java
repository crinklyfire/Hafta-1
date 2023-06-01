package Exercises;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        String username, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            username = inp.nextLine();

            System.out.print("Parolanızı giriniz : ");
            password = inp.nextLine();

            if ((username.equals("nezirbayhan")) && (password.equals("123456"))){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz : ");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgulama \n" +
                            "4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select){
                        case 1:{
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;}

                        case 2:{
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            if (price > balance){
                                System.out.println("Yetersiz bakiye.");
                            }else {
                                balance -= price;}
                            break;}

                        case 3:{
                            System.out.println("Bakiyeniz :" + balance);
                        break;
                        }
                    }
                }while (select != 4);
                System.out.println("Bankamızı seçtiğiniz için Teşekkür eder, İyi günler dileriz");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz!");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}
