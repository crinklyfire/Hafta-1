package Exercises;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        Matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        Fizik = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        Turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        Kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        Muzik = input.nextInt();

        int toplam = (Matematik + Fizik + Turkce + Kimya + Muzik);
        double sonuc = toplam / 5;
        System.out.println(sonuc);
        if(sonuc <= 55){
            System.out.println("Başarısız");
        }else{
            System.out.println("Tebrikler Geçtiniz.");
        }
        System.out.println("Ortalamanız : " + sonuc);

    }
}
