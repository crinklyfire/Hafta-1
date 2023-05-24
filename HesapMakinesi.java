package Exercises;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int x, y, z;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        x = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        y = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Hangi işlemi yapacaksınız : ");
        z = input.nextInt();

        switch (z) {
            case 1:
                System.out.print("Toplama : " + (x + y));
                break;

            case 2:
                System.out.print("Çıkarma : " + (x - y));
                break;

            case 3:
                System.out.print("Çarpma : " + (x * y));
                break;

            case 4:
                if (y == 0){
                    System.out.println("Bir sayı 0'a bölünemez");
                }else {
                    System.out.println("Bölme : " + (x / y));
                }
            default:
                System.out.println("Hatalı seçim. Tekrar deneyiniz.");
        }
    }
}
