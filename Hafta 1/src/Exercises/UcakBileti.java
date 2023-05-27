package Exercises;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int kM, age, trip;
        double perKm = 0.10, normalprice, dprice, ageprice, typeprice, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Km cinsinden giriniz: ");
        kM = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk türünüzü belirtiniz : ");
        System.out.print("Tek yön için 1 / Gidiş Dönüş için 2 : ");
        trip = input.nextInt();

        if (kM >= 0){
            switch (trip){
                case 1 : {
                    if (age <= 12) {
                        normalprice = kM * perKm;
                        ageprice = normalprice * 0.50;
                        dprice = normalprice - ageprice;
                        System.out.print("Toplam ücret : " + dprice + "TL");
                    } else if ((12 <= age) && (age <= 24)) {
                        normalprice = kM * perKm;
                        ageprice = normalprice * 0.10;
                        dprice = normalprice - ageprice;
                        System.out.print("Toplam ücret : " + dprice + "TL");
                    } else if (age >= 65) {
                        normalprice = kM * perKm;
                        ageprice = normalprice * 0.30;
                        dprice = normalprice - ageprice;
                        System.out.print("Toplam ücret : " + dprice + "TL");
                    } else {
                        normalprice = kM * perKm;
                        System.out.print("Toplam ücret : " + normalprice + "TL");
                    }break;
                }
                case 2 : {
                    if (age <= 12) {
                        normalprice = kM * perKm;
                        ageprice = normalprice * 0.50;
                        dprice = normalprice - ageprice;
                        typeprice = dprice * 0.2;
                        total = (dprice - typeprice) * 2;
                        System.out.print("Toplam ücret : " + total + "TL");
                    } else if ((12 <= age) && (age <= 24)) {
                        normalprice = kM * perKm;
                        ageprice = normalprice * 0.10;
                        dprice = normalprice - ageprice;
                        typeprice = dprice * 0.20;
                        total = (dprice - typeprice) * 2;
                        System.out.println("Toplam ücret : " + total + "TL");
                    } else if (age >= 65) {
                        normalprice = kM * perKm;
                        ageprice = normalprice * 0.30;
                        dprice = normalprice - ageprice;
                        typeprice = dprice * 0.20;
                        total = (dprice - typeprice) * 2;
                        System.out.print("Toplam ücret : " + total + "TL");
                    } else {
                        normalprice = kM * perKm;
                        typeprice = normalprice * 0.20;
                        total = normalprice - typeprice;
                        System.out.print("Toplam ücret : " + total + "TL");
                    }
                }break;
                default:
                    System.out.print("Hata! Lütfen kontrol edip tekrar deneyiniz!");
            }
        }else {
            System.out.print("Hata! Lütfen kontrol edip tekrar deneyiniz!");
        }
    }
}
