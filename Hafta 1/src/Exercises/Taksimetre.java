package Exercises;

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        //Değişkenler
        int km;
        double perKm = 2.20, total = 10;

        //Scanner Sınıfı Dahil edildi
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        //Total Ücret Hesaplama
        total += (km + perKm);

        total = (total < 20) ? 20 : total ;
        System.out.println("Toplam Ücret :" + total);


    }
}
